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

	PacienteDAO pacienteDAO;
	private  ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("Paciente BOIMPL");
	


	private Paciente mapeoAModelo(NuevoAfiliadoDto pacienteDto) {
		
		Paciente paciente = new Paciente();
		int telefono = Integer.parseInt(pacienteDto.getTelefono());
		paciente.setNombre(pacienteDto.getNombre());
		paciente.setApellido(pacienteDto.getApellido());
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
		afiliadoDto.setApellido(paciente.getApellido());
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
		afiliadoDto.setNombre(paciente.getNombre());
		return afiliadoDto;
	}
	
	
	private TurnoDto mapeoADto(Turno turno){
		
		TurnoDto turnoDto = new TurnoDto();
		turnoDto.setNombre(turno.getNombre());
		turnoDto.setApellido(turno.getApellido());
		turnoDto.setPlanMedico(turno.getPlanMedico());
		turnoDto.setFechaTurno(turno.getFechaTurno());
		turnoDto.setHoraTurno(turno.getHoraTurno());
		turnoDto.setFechaLlegada(turno.getFechaLlegada());
		turnoDto.setHoraLlegada(turno.getHoraLlegada());
		turnoDto.setFechaAtencion(turno.getFechaAtencion());
		turnoDto.setHoraAtencion(turno.getHoraAtencion());
		turnoDto.setImporte(turno.getImporte());
		turnoDto.setObservaciones(turno.getObservaciones());
		return turnoDto;
	}
	
	

	public PacienteDAO getPacienteDAO() {
		return pacienteDAO;
	}

	public void setPacienteDAO(PacienteDAO pacienteDAO) {
		this.pacienteDAO = pacienteDAO;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public void addPaciente(NuevoAfiliadoDto pacienteDto) {
		
		
		try {
			Paciente paciente = this.mapeoAModelo(pacienteDto);
			this.pacienteDAO.addPaciente(paciente);
//			this.pacientes.add(paciente);
		} catch (Exception e) {
			log.error("Error al tratar de hacer addPaciente "+ e.getMessage());
			// TODO: handle exception
		}
		
		
	}
	
	public NuevoAfiliadoDto busquedaPaciente(BusquedaAfiliadoDto pacienteBuscado){
		Paciente paciente = new Paciente();	
		paciente = this.pacienteDAO.buscarPorValor(pacienteBuscado.getValorbuscado(),pacienteBuscado.getTipodato());
		return this.mapeoADto(paciente);	
		
	}

	public List<Paciente> listPaciente() {
		return pacienteDAO.findAll();
	}
	
	
	public void deletePaciente(NuevoAfiliadoDto pacienteDto) {
	    	
	    	Paciente paciente = this.mapeoAModelo(pacienteDto);		
			this.pacienteDAO.deletePaciente(paciente);
	    }



	@Override
	public List<TurnoDto> getTurnosByIdPaciente(int idPaciente) {
		
		List<Turno> turnos = new ArrayList<Turno>();
		List<TurnoDto> turnosDto = new ArrayList<TurnoDto>();
		
	//	turnos = this.pacienteDAO.findTurnosByIdPaciente(idPaciente);
		
		for (Turno turno: turnos) {
			
			turnosDto.add(this.mapeoADto(turno));
		}
		
		return turnosDto;
	}
	
	
	
}
