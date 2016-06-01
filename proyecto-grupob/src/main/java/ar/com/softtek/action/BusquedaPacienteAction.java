package ar.com.softtek.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.softtek.bo.PacienteBo;
import ar.com.softtek.dto.BusquedaAfiliadoDto;
import ar.com.softtek.dto.NuevoAfiliadoDto;


public class BusquedaPacienteAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final Logger log = LogManager.getLogger("NuevoAfiliadoAction: ");
	private static final long serialVersionUID = 1L;
	private int valorbuscado;
	private NuevoAfiliadoDto afiliadoDto;
	private PacienteBo pacienteBo;	
	
	

	

	
	public NuevoAfiliadoDto getAfiliadoDto() {
		return afiliadoDto;
	}








	public void setAfiliadoDto(NuevoAfiliadoDto afiliadoDto) {
		this.afiliadoDto = afiliadoDto;
	}








	public String execute() {

		try {
			log.info("Action");
			BusquedaAfiliadoDto afiliadoBuscadoDto = new BusquedaAfiliadoDto(this.getValorbuscado());
			log.info("Creado afiliadoBuscado");
			afiliadoDto = this.pacienteBo.busquedaPaciente(afiliadoBuscadoDto);
			System.out.println(afiliadoDto.getApellido());
			return "success";

		} catch (Exception e) {

			log.error("Error al crear nuevo Paciente"+e.getMessage());
			return "error";
		}

	}








	public int getValorbuscado() {
		return valorbuscado;
	}








	public void setValorbuscado(int valorbuscado) {
		this.valorbuscado = valorbuscado;
	}








	public PacienteBo getPacienteBo() {
		return pacienteBo;
	}








	public void setPacienteBo(PacienteBo pacienteBo) {
		this.pacienteBo = pacienteBo;
	}

	
}

