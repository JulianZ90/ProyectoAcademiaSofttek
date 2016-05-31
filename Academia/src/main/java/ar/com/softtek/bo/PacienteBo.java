package ar.com.softtek.bo;

import ar.com.softtek.dto.NuevoAfiliadoDto;
import ar.com.softtek.model.Paciente;

import java.util.List;


public interface PacienteBo {

	void addPaciente(NuevoAfiliadoDto pacienteDto);
	
	List<Paciente> findPacientes();
	
}
