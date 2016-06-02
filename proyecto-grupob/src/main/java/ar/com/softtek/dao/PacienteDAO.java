package ar.com.softtek.dao;
import java.util.List;

import ar.com.softtek.dto.BusquedaAfiliadoDto;
import ar.com.softtek.model.Paciente;
import ar.com.softtek.model.Turno;


public interface PacienteDAO {

	
	List<Paciente> findAll();
	Paciente findById(Long id);
	List<Paciente> findByName();
	
	long addPaciente(Paciente paciente);
	void deletePaciente(Paciente paciente);
	void updatePaciente(Paciente paciente);
	Paciente buscarPorValor(String valorBuscado,String tipodato);
	List<Turno> findTurnosByIdPaciente(int idPaciente);
	
}
