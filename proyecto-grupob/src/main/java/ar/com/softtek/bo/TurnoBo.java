package ar.com.softtek.bo;

import java.util.List;

import ar.com.softtek.dto.TurnoDto;

public interface TurnoBo {

	void addTurno(TurnoDto turnoDto);
	
	List<TurnoDto> getTurnosByIdPaciente(int idPaciente);
}
