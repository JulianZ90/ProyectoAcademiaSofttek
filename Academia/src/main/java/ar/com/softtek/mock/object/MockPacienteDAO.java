package ar.com.softtek.mock.object;

import java.util.ArrayList;
import java.util.List;

import ar.com.softtek.model.Paciente;

public class MockPacienteDAO {

	// simulo el hibernate, que se conecta a la base de datos, con una lista.
	private List<Paciente> pacientes;
	
    public MockPacienteDAO() {
		
		this.pacientes = new ArrayList<Paciente>();
	}

    

	public List<Paciente> findAll() {
		
		return this.pacientes;
	}

	public int addPaciente(Paciente paciente) {
		
		this.pacientes.add(paciente);
		paciente.setId(this.pacientes.indexOf(paciente));
		return paciente.getId();
	}

	public void deletePaciente(Paciente paciente) {
		
		this.pacientes.remove(paciente);
	}
	
	
}
