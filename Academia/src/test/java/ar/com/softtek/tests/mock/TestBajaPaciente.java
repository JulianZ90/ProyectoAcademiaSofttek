package ar.com.softtek.tests.mock;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import ar.com.softtek.mock.object.MockBajaPacienteAction;
import ar.com.softtek.mock.object.MockPacienteBo;
import ar.com.softtek.mock.object.MockPacienteDAO;
import ar.com.softtek.model.Paciente;

public class TestBajaPaciente {

	@Test
	public void testDeberiaDevolverMensajeSuccessEnBajaDeUnPaciente() {
		
		MockBajaPacienteAction bajaPacienteAction = new MockBajaPacienteAction();
		MockPacienteDAO pacienteDAO = new MockPacienteDAO();
		MockPacienteBo pacienteBo = new MockPacienteBo();
		
		
		bajaPacienteAction.setPacienteBo(pacienteBo);
		pacienteBo.setPacienteDAO(pacienteDAO);
		
		bajaPacienteAction.setNombre("Juan");
		bajaPacienteAction.setApellido("Perez");
		bajaPacienteAction.setNroDoc(36587899);
		bajaPacienteAction.setTipoDoc("DNI");
		bajaPacienteAction.setTelefono("48777777");
		bajaPacienteAction.setMail("jp@gmail.com");
		bajaPacienteAction.setFecNac("14/10/2000");
		bajaPacienteAction.setSexo('M');
		bajaPacienteAction.setEstadoCivil("Soltero");
		bajaPacienteAction.setFamiliaresACargo(1);
		bajaPacienteAction.setPlanMedico(2);
		bajaPacienteAction.setCalle("maipu");
		bajaPacienteAction.setAltura(692);
		bajaPacienteAction.setDepartamento("A");
		bajaPacienteAction.setPiso("5");
		
		Assert.assertEquals(bajaPacienteAction.execute(), "success");
	}
	
	
	@Test
	public void testDeberiaDevolverLaListaVaciaAlDarDeBajaUnPaciente() {
		
		MockBajaPacienteAction bajaPacienteAction = new MockBajaPacienteAction();
		MockPacienteDAO pacienteDAO = new MockPacienteDAO();
		MockPacienteBo pacienteBo = new MockPacienteBo();
		
		
		bajaPacienteAction.setPacienteBo(pacienteBo);
		pacienteBo.setPacienteDAO(pacienteDAO);
		
		bajaPacienteAction.setNombre("Juan");
		bajaPacienteAction.setApellido("Perez");
		bajaPacienteAction.setNroDoc(36587899);
		bajaPacienteAction.setTipoDoc("DNI");
		bajaPacienteAction.setTelefono("48777777");
		bajaPacienteAction.setMail("jp@gmail.com");
		bajaPacienteAction.setFecNac("14/10/2000");
		bajaPacienteAction.setSexo('M');
		bajaPacienteAction.setEstadoCivil("Soltero");
		bajaPacienteAction.setFamiliaresACargo(1);
		bajaPacienteAction.setPlanMedico(2);
		bajaPacienteAction.setCalle("maipu");
		bajaPacienteAction.setAltura(692);
		bajaPacienteAction.setDepartamento("A");
		bajaPacienteAction.setPiso("5");
		
		bajaPacienteAction.execute();
		List<Paciente> pacientes = pacienteBo.findPacientes();
		
		Assert.assertEquals(pacientes.size(), 0);
	}

}
