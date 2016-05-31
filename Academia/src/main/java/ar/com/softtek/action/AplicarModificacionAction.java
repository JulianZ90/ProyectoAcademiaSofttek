//CAMBIARRRR!!!

package ar.com.softtek.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.softtek.dto.BajaAfiliadoDto;
import ar.com.softtek.dto.PacienteAModificarDto;
import ar.com.softtek.dto.PacienteModificacionDuplexDto;
import ar.com.softtek.dto.PlanMedicoDto;


public class AplicarModificacionAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("AplicarModificacionAction: ");
	private String botonPresionado;
	private PacienteModificacionDuplexDto pacienteDatosNuevos;
	
	// private int numdocumento;
	// private String tipodoc;
	// private PacienteAModificarDto pacienteAModificarDto;

	// public int getNumdocumento() {
	// return numdocumento;
	// }
	// public void setNumdocumento(int numdocumento) {
	// this.numdocumento = numdocumento;
	// }
	// public String getTipodoc() {
	// return tipodoc;
	// }
	// public void setTipodoc(String tipodoc) {
	// this.tipodoc = tipodoc;
	// }
	//

	public PacienteModificacionDuplexDto getPacienteDatosNuevos() {
		return pacienteDatosNuevos;
	}

	public void setPacienteDatosNuevos(PacienteModificacionDuplexDto pacienteDatosNuevos) {
		this.pacienteDatosNuevos = pacienteDatosNuevos;
	}
	public String getBotonPresionado() {
		return botonPresionado;
	}

	public void setBotonPresionado(String botonPresionado) {
		this.botonPresionado = botonPresionado;
	}

	public String execute() throws Exception {

		if ("Modificar".equals(botonPresionado)) {
			try {

				log.info("Exito al modificar afiliado");

				//Para Probar
//				setPacienteDatosNuevos(new PacienteModificacionDuplexDto("NOMEE","Apee","12123", "a@a.com", "09/09/1991", 'M',"Soltero/a", "Calle trucha",
//						5, new PlanDto("UN PLAN"),"Estaba Aburrido"));
//				System.out.println(pacienteDatosNuevos.toString());

	
				return "success";

			} catch (Exception e) {

				log.error("Error al intentar modificar al afiliado");
				return "error";
			}
		}

		if ("Cancelar".equals(botonPresionado)) {
			try {

				log.info("Exito al cancelar la modificacion");
				return "volverABusqueda";

			} catch (Exception e) {

				log.error("Error al intentar cancelar la modificacion");
				return "error";
			}
		}
		return super.execute();

	}

	

}
