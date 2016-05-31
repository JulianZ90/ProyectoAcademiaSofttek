package ar.com.softtek.action;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.softtek.dto.BajaAfiliadoDto;
import ar.com.softtek.dto.PacienteAModificarDto;
import ar.com.softtek.dto.PacienteModificacionDuplexDto;
import ar.com.softtek.dto.PlanMedicoDto;





public class BajaModificacionPacienteAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("BajaModificacionAfiliadoAction: ");
	private String botonPresionado;
	private int numdocumento;
	private String tipodoc;
	private String horabaja;
	private BajaAfiliadoDto bajaAfiliadoDto;
	private PacienteAModificarDto pacienteAModificarDto;
	private PacienteModificacionDuplexDto pacienteDatosViejos;

	public String getBotonPresionado() {
		return botonPresionado;
	}
	public void setBotonPresionado(String botonPresionado) {
		this.botonPresionado = botonPresionado;
	}
	public PacienteModificacionDuplexDto getPacienteDatosViejos() {
		return pacienteDatosViejos;
	}
	public void setPacienteDatosViejos(PacienteModificacionDuplexDto pacienteDatosViejos) {
		this.pacienteDatosViejos = pacienteDatosViejos;
	}	
	
	public String getHorabaja() {
		return horabaja;
	}
	public void setHorabaja(String horabaja) {
		this.horabaja = horabaja;
	}
	public int getNumdocumento() {
		return numdocumento;
	}
	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}
	
	

	public String execute() throws Exception {

		if ("DardeBaja".equals(botonPresionado)) {
			try {

				log.info("Exito al dar de baja al afiliado");
				bajaAfiliadoDto = new BajaAfiliadoDto(getNumdocumento(), getTipodoc(), getHorabaja());
				System.out.println(bajaAfiliadoDto.toString());

				return "success";

			} catch (Exception e) {

				log.error("Error al intentar dar de baja al afiliado");
				return "error";
			}
		}
			
		if("Modificar".equals(botonPresionado)) 
		{
			try {

				log.info("Exito al Buscar el paciente a modificar");
				pacienteAModificarDto=new PacienteAModificarDto(getNumdocumento(), getTipodoc());
				System.out.println(pacienteAModificarDto.toString());
			
				//Aca se lo pasa al BO via PacienteAModificarDto y este le devuelve los datos
				// via PacienteModificacionDuplexDto
				// Pasarselo a la vista Modificacion de afiliado
				
				//Para Probar
				pacienteDatosViejos=
				new PacienteModificacionDuplexDto(1111, "D.N.I.","Apee","NOMEE", "12123", "a@a.com", "09/09/1991", 'M',"Soltero/a", "Calle trucha",5, new PlanMedicoDto(1111),"Estaba Aburrido");
				System.out.println(pacienteDatosViejos.toString());
				
				return "modificarPaciente";

			} catch (Exception e) {

				log.error("Error al intentar buscar el paciente a modificar");
				return "error";
			}
		      }
		return super.execute();
			
	}
	
	
	
		
		
		
	
 
		}
	

	


