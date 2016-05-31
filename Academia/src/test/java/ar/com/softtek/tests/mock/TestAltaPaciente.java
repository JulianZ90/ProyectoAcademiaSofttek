package ar.com.softtek.tests.mock;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.com.softtek.mock.object.MockNuevoPacienteAction;
import ar.com.softtek.mock.object.MockPacienteBo;
import ar.com.softtek.mock.object.MockPacienteDAO;
import ar.com.softtek.model.Paciente;

public class TestAltaPaciente {

	@Test
	public void testDeberiaDevolverMensajeSuccessAlAgregarUnNuevoPaciente() {
		
		MockNuevoPacienteAction nuevoPacienteAction = new MockNuevoPacienteAction();
		MockPacienteDAO pacienteDAO = new MockPacienteDAO();
		MockPacienteBo pacienteBo = new MockPacienteBo(pacienteDAO);
		
		nuevoPacienteAction.setPacienteBo(pacienteBo);
		pacienteBo.setPacienteDAO(pacienteDAO);
		
		nuevoPacienteAction.setNombre("Juan");
		nuevoPacienteAction.setApellido("Perez");
		nuevoPacienteAction.setNroDoc(36587899);
		nuevoPacienteAction.setTipoDoc("DNI");
		nuevoPacienteAction.setTelefono("48777777");
		nuevoPacienteAction.setMail("jp@gmail.com");
		nuevoPacienteAction.setFecNac("14/10/2000");
		nuevoPacienteAction.setSexo('M');
		nuevoPacienteAction.setEstadoCivil("Soltero");
		nuevoPacienteAction.setFamiliaresACargo(1);
		nuevoPacienteAction.setPlanMedico(2);
		nuevoPacienteAction.setCalle("maipu");
		nuevoPacienteAction.setAltura(692);
		nuevoPacienteAction.setDepartamento("A");
		nuevoPacienteAction.setPiso("5");
		
		Assert.assertEquals(nuevoPacienteAction.execute(), "success");
		
	}
	
	
	@Test
	public void testDeberiaDevolverLaListaDePacientes() {
		
		
		MockNuevoPacienteAction nuevoPacienteAction = new MockNuevoPacienteAction();
		MockPacienteDAO pacienteDAO = new MockPacienteDAO();
		MockPacienteBo pacienteBo = new MockPacienteBo(pacienteDAO);
		
		
		nuevoPacienteAction.setPacienteBo(pacienteBo);
		
		nuevoPacienteAction.setNombre("Juan");
		nuevoPacienteAction.setApellido("Perez");
		nuevoPacienteAction.setNroDoc(36587899);
		nuevoPacienteAction.setTipoDoc("DNI");
		nuevoPacienteAction.setTelefono("48777777");
		nuevoPacienteAction.setMail("jp@gmail.com");
		nuevoPacienteAction.setFecNac("14/10/2000");
		nuevoPacienteAction.setSexo('M');
		nuevoPacienteAction.setEstadoCivil("Soltero");
		nuevoPacienteAction.setFamiliaresACargo(1);
		nuevoPacienteAction.setPlanMedico(2);
		nuevoPacienteAction.setCalle("maipu");
		nuevoPacienteAction.setAltura(692);
		nuevoPacienteAction.setDepartamento("A");
		nuevoPacienteAction.setPiso("5");
		
		nuevoPacienteAction.execute();
		List<Paciente> pacientes = pacienteBo.getPacientes();
		
		Assert.assertEquals(pacientes.get(0).getDni(), nuevoPacienteAction.getNroDoc());
		
	}
	
	
	@Test
	public void testDeberiaIniciarLaListaDePacientesConUnPaciente() {
		
		MockPacienteDAO pacienteDAO = new MockPacienteDAO();
		Paciente paciente = new Paciente();
		
		paciente.setNombre("Juan");
		paciente.setApellido("Perez");
		paciente.setDni(36587899);
		paciente.setTipoDni("DNI");
		paciente.setTelefono(48777777);
		paciente.setMail("jp@gmail.com");
		paciente.setFecNac("14/10/2000");
		paciente.setSexo('M');
		paciente.setEstadoCivil("Soltero");
		paciente.setFamiliaresACargo(1);
		paciente.setPlanMedico(2);
		paciente.setDireccion("maipu");
		
		pacienteDAO.addPaciente(paciente);
		
		MockPacienteBo pacienteBo = new MockPacienteBo(pacienteDAO);
		MockNuevoPacienteAction nuevoPacienteAction = new MockNuevoPacienteAction();
		nuevoPacienteAction.setPacienteBo(pacienteBo);
			
		List<Paciente> pacientes = pacienteBo.getPacientes();
		
		Assert.assertEquals(pacientes.size(), 1);
		
	}
	
	
	@Test
	public void testDeberiaDevolverElIDPaciente() {
		
		MockPacienteDAO pacienteDAO = new MockPacienteDAO();
		Paciente paciente = new Paciente();
		
		paciente.setNombre("Juan");
		paciente.setApellido("Perez");
		paciente.setDni(36587899);
		paciente.setTipoDni("DNI");
		paciente.setTelefono(48777777);
		paciente.setMail("jp@gmail.com");
		paciente.setFecNac("14/10/2000");
		paciente.setSexo('M');
		paciente.setEstadoCivil("Soltero");
		paciente.setFamiliaresACargo(1);
		paciente.setPlanMedico(2);
		paciente.setDireccion("maipu");
		
		int id = pacienteDAO.addPaciente(paciente);
		
		Assert.assertEquals(paciente.getId(), id);
		
	}

}
