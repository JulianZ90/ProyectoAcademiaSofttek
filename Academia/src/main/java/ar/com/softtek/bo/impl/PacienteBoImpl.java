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

	public void addPaciente(NuevoAfiliadoDto pacienteDto) {
		this.pacienteDAO.addPaciente(pacienteDto);
		
	}

	public List<Paciente> listPaciente() {
		return pacienteDAO.findAll();
	}
	
	
	
	
}
