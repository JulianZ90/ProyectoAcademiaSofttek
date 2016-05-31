package ar.com.softtek.mock.object;

import java.util.ArrayList;
import java.util.List;
import ar.com.softtek.dto.NuevoAfiliadoDto;
import ar.com.softtek.model.Paciente;

public class MockPacienteBo {

	private MockPacienteDAO pacienteDAO;
    private  ArrayList<Paciente> pacientes;
	
	
	public MockPacienteBo(MockPacienteDAO pacienteDAO) {
		
		this.pacienteDAO = pacienteDAO;
		this.pacientes =  new ArrayList<Paciente>();
		for (Paciente paciente : this.findPacientes()) {

			this.pacientes.add(paciente);
		}
	}
	
	
	public void setPacienteDAO(MockPacienteDAO pacienteDAO) {
		
		this.pacienteDAO = pacienteDAO;
	}

	private Paciente mapeo(NuevoAfiliadoDto pacienteDto) {
		
		Paciente paciente = new Paciente();
		int telefono = Integer.parseInt(pacienteDto.getTelefono());
		paciente.setNombre(pacienteDto.getNombre());
		paciente.setApellido(pacienteDto.getApellido());
		paciente.setDni(pacienteDto.getDni());
		paciente.setTipoDni(pacienteDto.getTipoDni());
		paciente.setTelefono(telefono);
		paciente.setMail(pacienteDto.getMail());
		paciente.setFecNac(pacienteDto.getFecNac());
		paciente.setSexo(pacienteDto.getSexo());
		paciente.setEstadoCivil(pacienteDto.getEstadoCivil());
		paciente.setDireccion(pacienteDto.getDireccion());
		paciente.setFamiliaresACargo(pacienteDto.getFamiliaresACargo());
		paciente.setPlanMedico(pacienteDto.getPlanMedico().getDescripcion());
				
		return paciente;
	}

	public void addPaciente(NuevoAfiliadoDto pacienteDto) {
		
		Paciente paciente= this.mapeo(pacienteDto);		
		this.pacienteDAO.addPaciente(paciente);
		this.pacientes.add(paciente);
	}

	public List<Paciente> findPacientes() {
		
		return pacienteDAO.findAll();
	}
	
	public List<Paciente> getPacientes() {
		
		return this.pacientes;
	}
}
