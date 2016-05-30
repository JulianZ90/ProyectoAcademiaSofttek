package ar.com.softtek.bo.impl;

import java.util.List;

import ar.com.softtek.bo.PacienteBo;
import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.model.Paciente;
import ar.com.softtek.dto.NuevoAfiliadoDto;

public class PacienteBoImpl implements PacienteBo {

	PacienteDAO pacienteDAO;
	
	public void setPacienteDAO(PacienteDAO paciente){
		this.pacienteDAO=paciente;
	}
	
	private Paciente mapeo(NuevoAfiliadoDto pacienteDto) {
		
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
		paciente.setPlanMedico(pacienteDto.getPlanMedico().getDescripcion());
		
		return paciente;
	}

	public void addPaciente(NuevoAfiliadoDto pacienteDto) {
				
		this.pacienteDAO.addPaciente(this.mapeo(pacienteDto));
	}

	public List<Paciente> listPaciente() {
		return pacienteDAO.findAll();
	}
	
}
