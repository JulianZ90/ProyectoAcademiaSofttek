package ar.com.softtek.model;

import java.util.Date;

public class Paciente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private String tipoDni;
	private int telefono;
	private String mail;
	private Date fecNac;
	private char sexo;
	private String estadoCivil;
	private int cantHijos;
	private Plan planMedico;
	private Date fechaDeBaja;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Plan getPlanMedico() {
		return planMedico;
	}
	public void setPlanMedico(Plan planMedico) {
		this.planMedico = planMedico;
	}
	public Date getFechaDeBaja() {
		return fechaDeBaja;
	}
	public void setFechaDeBaja(Date fechaDeBaja) {
		this.fechaDeBaja = fechaDeBaja;
	}

	
	
}
