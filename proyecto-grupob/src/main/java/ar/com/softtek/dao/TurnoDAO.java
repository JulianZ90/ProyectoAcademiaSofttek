package ar.com.softtek.dao;

import java.util.List;

import ar.com.softtek.model.Turno;

public interface TurnoDAO {

	void addTurno(Turno turno);
	
	List<Turno> findTurnosByIdPaciente(int idPaciente);
}
