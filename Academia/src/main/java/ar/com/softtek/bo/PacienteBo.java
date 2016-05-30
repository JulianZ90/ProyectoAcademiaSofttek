package ar.com.softtek.bo;

import ar.com.softtek.model.Paciente;

import java.util.List;


public interface PacienteBo {

	void addPaciente(Paciente paciente);
	
	List<Paciente> listPaciente();
	
}
