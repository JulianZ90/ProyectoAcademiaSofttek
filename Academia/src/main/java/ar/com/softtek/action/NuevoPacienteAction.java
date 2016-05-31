package ar.com.softtek.action;

import ar.com.softtek.dto.PacienteDto;

public class NuevoPacienteAction extends PacienteAction {

	private static final long serialVersionUID = 1L;

	@Override
	public void action(PacienteDto pacienteDto) {
		
		this.pacienteBo.addPaciente(pacienteDto);
	}
	
}
