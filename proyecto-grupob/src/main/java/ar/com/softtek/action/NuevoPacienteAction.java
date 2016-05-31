package ar.com.softtek.action;

import ar.com.softtek.dto.NuevoAfiliadoDto;

public class NuevoPacienteAction extends PacienteAction {

	@Override
	public void action(NuevoAfiliadoDto nuevoAfiliadoDto) {
		
		this.pacienteBo.addPaciente(nuevoAfiliadoDto);
	}
	
	
}