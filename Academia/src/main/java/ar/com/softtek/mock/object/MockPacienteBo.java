package ar.com.softtek.mock.object;

import java.util.List;
import ar.com.softtek.dto.PacienteDto;
import ar.com.softtek.model.Paciente;

public class MockPacienteBo {

	private MockPacienteDAO pacienteDAO;
	
	public void setPacienteDAO(MockPacienteDAO pacienteDAO) {
		
		this.pacienteDAO = pacienteDAO;
	}

	private Paciente mapeo(PacienteDto pacienteDto) {
		
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

	public List<Paciente> findPacientes() {
		
		return pacienteDAO.findAll();
	}
	
    public void addPaciente(PacienteDto pacienteDto) {
		
		Paciente paciente = this.mapeo(pacienteDto);		
		this.pacienteDAO.addPaciente(paciente);
	}
	
	public void deletePaciente(PacienteDto pacienteDto) {
		
		Paciente paciente = this.mapeo(pacienteDto);
		this.pacienteDAO.deletePaciente(paciente);		
	}
}
