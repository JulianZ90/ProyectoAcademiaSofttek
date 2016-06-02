package ar.com.softtek.action;

import java.util.ArrayList;
import java.util.List;

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
	
	
	private String valorbuscado;
	private String tipodato;
	
	private List<NuevoAfiliadoDto> afiliadoDtos = new ArrayList<NuevoAfiliadoDto>();
	private PacienteBo pacienteBo;	

	
	

	

	
	public String getTipodato() {
		return tipodato;
	}








	public void setTipodato(String tipodato) {
		this.tipodato = tipodato;
	}








	public List<NuevoAfiliadoDto> getAfiliadoDtos() {
		return afiliadoDtos;
	}








	public void setAfiliadoDtos(List<NuevoAfiliadoDto> afiliadoDtos) {
		this.afiliadoDtos = afiliadoDtos;
	}








	public String execute() {

		try {
			log.info("Action");
			BusquedaAfiliadoDto afiliadoBuscadoDto = new BusquedaAfiliadoDto(this.getValorbuscado(),this.getTipodato());
			log.info(String.valueOf(afiliadoBuscadoDto.getValorbuscado()));
			log.info(String.valueOf(afiliadoBuscadoDto.getTipodato()));
			log.info("Creado afiliadoBuscado");
			afiliadoDtos = this.pacienteBo.busquedaPaciente(afiliadoBuscadoDto);
//			afiliadoDto.setApenom( afiliadoDto.getNombre()+ " " + afiliadoDto.getApellido());
//			System.out.println(afiliadoDto.getApellido());
			
			return "success";

		} catch (Exception e) {

			log.error("Error al crear nuevo Paciente"+e.getMessage());
			return "error";
		}

	}








	public String getValorbuscado() {
		return valorbuscado;
	}








	public void setValorbuscado(String valorbuscado) {
		this.valorbuscado = valorbuscado;
	}








	public PacienteBo getPacienteBo() {
		return pacienteBo;
	}








	public void setPacienteBo(PacienteBo pacienteBo) {
		this.pacienteBo = pacienteBo;
	}

	
}

