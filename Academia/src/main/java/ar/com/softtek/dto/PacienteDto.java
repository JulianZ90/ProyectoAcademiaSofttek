package ar.com.softtek.dto;

import java.util.Date;

public class PacienteDto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private int dni;
	private String tipoDni;
	private int telefono;
	private String mail;
	private Date fecNac;
	private char sexo;
	private String estadoCivil;
	private String direccion;
	private int cantHijos;
	private PlanDto planMedico;
	
	public PacienteDto(String nombre, String apellido, int dni, String tipoDni, int telefono, String mail, Date fecNac,
			char sexo, String estadoCivil, String direccion, int cantHijos,
			PlanDto planMedico) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.tipoDni = tipoDni;
		this.telefono = telefono;
		this.mail = mail;
		this.fecNac = fecNac;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.cantHijos = cantHijos;
		this.planMedico = planMedico;
		
	}
		
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getFecNac() {
		return fecNac;
	}
	public void setFecNac(Date fecNac) {
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
	public PlanDto getPlanMedico() {
		return planMedico;
	}
	public void setPlanMedico(PlanDto planMedico) {
		this.planMedico = planMedico;
	}

	
	
}
