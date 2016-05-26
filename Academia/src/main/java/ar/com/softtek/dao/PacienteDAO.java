package ar.com.softtek.dao;
import java.util.List;

import ar.com.softtek.model.Paciente;


public interface PacienteDAO {

	void addPaciente(Paciente paciente);
	
	List<Paciente> listPaciente();
	
}
