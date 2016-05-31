package ar.com.softtek.action;

import ar.com.softtek.dto.PacienteDto;

public class BajaPacienteAction extends PacienteAction {

	private static final long serialVersionUID = 1L;

	@Override
	public void action(PacienteDto pacienteDto) {
		
		this.pacienteBo.deletePaciente(pacienteDto);
	}
	
}