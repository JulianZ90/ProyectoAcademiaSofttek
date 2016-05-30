package ar.com.softtek.bo.impl;
import java.util.List;

import ar.com.softtek.bo.PacienteBo;
import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.model.Paciente;

public class PacienteBoImpl implements PacienteBo {

	PacienteDAO pacienteDAO;
	
	public void setPacienteDAO(PacienteDAO paciente){
		this.pacienteDAO=paciente;
	}

	public void addPaciente(Paciente paciente) {
		this.pacienteDAO.addPaciente(paciente);
		
	}

	public List<Paciente> listPaciente() {
		return pacienteDAO.findAll();
	}
	
	
	
	
}
