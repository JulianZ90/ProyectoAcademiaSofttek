package ar.com.softtek.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import ar.com.softtek.bo.PacienteBo;
import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.model.Paciente;
import ar.com.softtek.model.Turno;
import ar.com.softtek.dto.BusquedaAfiliadoDto;
import ar.com.softtek.dto.NuevoAfiliadoDto;
import ar.com.softtek.dto.TurnoDto;

public class PacienteBoImpl implements PacienteBo {

	private PacienteDAO pacienteDAO;
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("Paciente BOIMPL");
	


	private Paciente mapeoAModelo(NuevoAfiliadoDto pacienteDto) {
		
		Paciente paciente = new Paciente();
		int telefono = Integer.parseInt(pacienteDto.getTelefono());
		paciente.setNyAp(pacienteDto.getNombre()+" "+pacienteDto.getApellido());
		paciente.setDni(pacienteDto.getDni());
		paciente.setTipoDni(pacienteDto.getTipoDni());
		paciente.setTelefono(telefono);
		paciente.setMail(pacienteDto.getMail());
		paciente.setFecNac(pacienteDto.getFecNac());
		paciente.setSexo(pacienteDto.getSexo());
		paciente.setEstadoCivil(pacienteDto.getEstadoCivil());
		paciente.setDireccion(pacienteDto.getDireccion());
		paciente.setFamiliaresACargo(pacienteDto.getCantHijos());
		paciente.setPlanMedico(pacienteDto.getPlanMedico());	
		return paciente;
	}
	
	
	private NuevoAfiliadoDto mapeoADto(Paciente paciente){
		NuevoAfiliadoDto afiliadoDto = new NuevoAfiliadoDto();
		String telefono = String.valueOf(paciente.getTelefono());
		afiliadoDto.setTelefono(telefono);
		afiliadoDto.setIdPaciente(paciente.getIdPaciente());
		afiliadoDto.setApenom(paciente.getNyAp());
		afiliadoDto.setCantHijos(paciente.getFamiliaresACargo());
		afiliadoDto.setDireccion(paciente.getDireccion());
		afiliadoDto.setDni(paciente.getDni());
		afiliadoDto.setEstadoCivil(paciente.getEstadoCivil());
		String fecNac = String.valueOf(paciente.getFecNac());
		afiliadoDto.setFecNac(fecNac);
		afiliadoDto.setTipoDni(paciente.getTipoDni());
		afiliadoDto.setMail(paciente.getMail());
		afiliadoDto.setSexo(paciente.getSexo());
		afiliadoDto.setPlanMedico(paciente.getPlanMedico());
		return afiliadoDto;
	}
	
	
	
	public PacienteDAO getPacienteDAO() {
		return pacienteDAO;
	}

	public void setPacienteDAO(PacienteDAO pacienteDAO) {
		this.pacienteDAO = pacienteDAO;
	}
	

	public void addPaciente(NuevoAfiliadoDto pacienteDto) {
		
		
		try {
			Paciente paciente = this.mapeoAModelo(pacienteDto);
			this.pacienteDAO.addPaciente(paciente);

		} catch (Exception e) {
			log.error("Error al tratar de hacer addPaciente "+ e.getMessage());
			// TODO: handle exception
		}
		
		
	}
	
	public List<NuevoAfiliadoDto> busquedaPaciente(BusquedaAfiliadoDto pacienteBuscado){
		List<Paciente> pacientes = new ArrayList<Paciente>();	
		pacientes = this.pacienteDAO.buscarPorValor(pacienteBuscado.getValorbuscado(),pacienteBuscado.getTipodato());
		return this.mapearLista(pacientes);
	}

	public List<NuevoAfiliadoDto> mapearLista(List<Paciente> pacientes) {
		List<NuevoAfiliadoDto> li = new ArrayList<NuevoAfiliadoDto>();
		for(Paciente p: pacientes){
			li.add(this.mapeoADto(p));
		}
		return li;
	}


	public List<Paciente> listPaciente() {
		return pacienteDAO.findAll();
	}
	
	
	public void deletePaciente(NuevoAfiliadoDto pacienteDto) {
	    	
	    	Paciente paciente = this.mapeoAModelo(pacienteDto);		
			this.pacienteDAO.deletePaciente(paciente);
	    }
	
	
	
}
