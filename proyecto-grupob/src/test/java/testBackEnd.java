import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.com.softtek.action.NuevoPacienteAction;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {})
@Transactional


public class testBackEnd {
	
	private NuevoPacienteAction nuevoPacienteAction = new NuevoPacienteAction();
	
	@Test
	@Transactional
	@Rollback(true)
	public void testInsert(){
		nuevoPacienteAction.setNombre("Julian");
		nuevoPacienteAction.setApellido("Zelayeta");
		nuevoPacienteAction.setNumdocumento(35331963);
		nuevoPacienteAction.setTipodoc("DNI");
		nuevoPacienteAction.setCalle("Avellaneda");
		nuevoPacienteAction.setAltura(195);
		nuevoPacienteAction.setTelefono("1137704563");
		nuevoPacienteAction.setMail("julian.zelayeta@gmail.com");
		nuevoPacienteAction.setFechanac("06/11/1990");
		nuevoPacienteAction.setSexo('M');
		nuevoPacienteAction.setEstadocivil("Soltero");
		nuevoPacienteAction.setCanthijos(0);
		nuevoPacienteAction.setPlan(210);
		assertEquals("success",nuevoPacienteAction.execute());	
	}	
	

}
