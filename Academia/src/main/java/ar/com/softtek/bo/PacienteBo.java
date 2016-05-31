package ar.com.softtek.bo;

import ar.com.softtek.dto.PacienteDto;
import ar.com.softtek.model.Paciente;

import java.util.List;


public interface PacienteBo {

	List<Paciente> findPacientes();
	
	void addPaciente(PacienteDto pacienteDto);
	
	void deletePaciente(PacienteDto pacienteDto);
	
}
