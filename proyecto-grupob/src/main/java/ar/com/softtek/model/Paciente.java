package ar.com.softtek.model;



public class Paciente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idPaciente;
	private String nombre;
	private String apellido;
	private int dni;
	private String tipoDni;
	private int telefono;
	private String mail;
	private String fecNac;
	private char sexo;
	private String estadoCivil;
	private String direccion;
	private int familiaresACargo;
	private int planMedico;
	private String fechaBaja;
	
	
	public String getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int id) {
		this.idPaciente = id;
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
	public int getFamiliaresACargo() {
		return familiaresACargo;
	}
	public void setFamiliaresACargo(int cantHijos) {
		this.familiaresACargo = cantHijos;
	}
	public int getPlanMedico() {
		return planMedico;
	}
	public void setPlanMedico(int planMedico) {
		this.planMedico = planMedico;
	}
	public String getFechaDeBaja() {
		return fechaBaja;
	}
	public void setFechaDeBaja(String fechaDeBaja) {
		this.fechaBaja = fechaDeBaja;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
