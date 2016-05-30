package ar.com.softtek.model;

import java.sql.Date;

public class Profesional implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String apellido;
	private Date horaIngreso;
	private Date horaSalida;
	private Practica practica;
	
	
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
	public Date getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(Date horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Practica getPractica() {
		return practica;
	}
	public void setPractica(Practica practica) {
		this.practica = practica;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
