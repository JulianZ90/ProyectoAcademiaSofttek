package ar.com.softtek.dto;

import java.util.Date;

public class PacienteModificacionDuplexDto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private int dni;
	private String tipoDni;
	private String telefono;
	private String mail;
	private String fecNac;
	private char sexo;
	private String estadoCivil;
	private String direccion;
	private int cantHijos;
	private PlanMedicoDto planMedico;
	private String motivoCambio;
	
		
	

//
//	public PacienteModificacionDuplexDto(String nombre, String apellido, int dni, String tipoDni, String telefono, String mail, String fecNac,
//			char sexo, String estadoCivil, String direccion, int cantHijos, PlanDto planMedico) {
//		
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.dni = dni;
//		this.tipoDni = tipoDni;
//		this.telefono = telefono;
//		this.mail = mail;
//		this.fecNac = fecNac;
//		this.sexo = sexo;
//		this.estadoCivil = estadoCivil;
//		this.direccion = direccion;
//		this.cantHijos = cantHijos;
//		this.planMedico = planMedico;
//	}


//	@Override
//	public String toString() {
//		return "PacienteDto [getDireccion()=" + getDireccion() + ", getNombre()=" + getNombre() + ", getApellido()="
//				+ getApellido() + ", getDni()=" + getDni() + ", getTipoDni()=" + getTipoDni() + ", getTelefono()="
//				+ getTelefono() + ", getMail()=" + getMail() + ", getFecNac()=" + getFecNac() + ", getSexo()="
//				+ getSexo() + ", getEstadoCivil()=" + getEstadoCivil() + ", getCantHijos()=" + getCantHijos()
//				+ ", getPlanMedico()=" + getPlanMedico().getDescripcion() + "]";
//	}
//

	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getTipoDni() {
		return tipoDni;
	}
	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFecNac() {
		return fecNac;
	}
	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	public PlanMedicoDto getPlanMedico() {
		return planMedico;
	}
	public void setPlanMedico(PlanMedicoDto planMedico) {
		this.planMedico = planMedico;
	}
	public String getMotivoCambio() {
		return motivoCambio;
	}
	public void setMotivoCambio(String motivoCambio) {
		this.motivoCambio = motivoCambio;
	}
	@Override
	public String toString() {
		return "PacienteModificacionDuplexDto [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", tipoDni=" + tipoDni + ", telefono=" + telefono + ", mail=" + mail + ", fecNac=" + fecNac
				+ ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", direccion=" + direccion + ", cantHijos="
				+ cantHijos + ", planMedico=" + planMedico + ", motivoCambio=" + motivoCambio + "]";
	}
	public PacienteModificacionDuplexDto(int dni, String tipoDni,String nombre, String apellido,  String telefono,
			String mail, String fecNac, char sexo, String estadoCivil, String direccion, int cantHijos,
			PlanMedicoDto planMedico, String motivoCambio) {
		this.dni = dni;
		this.tipoDni = tipoDni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.mail = mail;
		this.fecNac = fecNac;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.cantHijos = cantHijos;
		this.planMedico = planMedico;
		this.motivoCambio = motivoCambio;
	}
	
	
}
