package ar.com.softtek.bo;

import ar.com.softtek.dto.BusquedaAfiliadoDto;
import ar.com.softtek.dto.NuevoAfiliadoDto;
import ar.com.softtek.dto.TurnoDto;
import ar.com.softtek.model.Paciente;

import java.util.List;


public interface PacienteBo {
	
	List<NuevoAfiliadoDto> busquedaPaciente(BusquedaAfiliadoDto pacienteDto);

	void addPaciente(NuevoAfiliadoDto pacienteDto);
	
	List<Paciente> listPaciente();
	
	void deletePaciente(NuevoAfiliadoDto pacienteDto);
	
}
