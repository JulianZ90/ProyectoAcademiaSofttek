package ar.com.softtek.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.softtek.bo.PacienteBo;
import ar.com.softtek.dto.NuevoAfiliadoDto;


public abstract class  PacienteAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("NuevoAfiliadoAction: ");

	private String nombre;
	private String apellido;
	private int numdocumento;
	private String tipodoc;
	private String telefono;
	private String mail;
	private String fechanac;
	private char sexo;
	private String calle;
	private String estadocivil;
	private int canthijos;
	private int plan;
	private String departamento;
	private String piso;
	private int altura;
	//private NuevoAfiliadoDto nuevoAfiliadoDto;
	protected PacienteBo pacienteBo;
	
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

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public int getCanthijos() {
		return canthijos;
	}

	public void setCanthijos(int canthijos) {
		this.canthijos = canthijos;
	}

	public int getPlan() {
		return plan;
	}

	public void setPlan(int plan) {
		this.plan = plan;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

//	public NuevoAfiliadoDto getNuevoAfiliadoDto() {
//		return nuevoAfiliadoDto;
//	}
//
//	public void setNuevoAfiliadoDto(NuevoAfiliadoDto nuevoAfiliadoDto) {
//		this.nuevoAfiliadoDto = nuevoAfiliadoDto;
//	}

	public String execute() {

		try {

			log.info("Exito al crear nuevo Paciente");

			NuevoAfiliadoDto nuevoAfiliadoDto = new NuevoAfiliadoDto(this.getNombre(), this.getApellido(), this.getNumdocumento(),
					this.getTipodoc(), this.getTelefono(), this.getMail(), this.getFechanac(), this.getSexo(),
					this.getEstadocivil(),
					(this.getCalle() + this.getAltura() + this.getPiso() + this.getDepartamento()), this.getCanthijos(),
					this.getPlan());

		System.out.println("El pacienteDto creado es:");
			
			System.out.println(nuevoAfiliadoDto.toString());
			
			this.action(nuevoAfiliadoDto);
			
			
			return "success";

		} catch (Exception e) {

			log.error("Error al crear nuevo Paciente"+e.getMessage());
			return "error";
		}

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Logger getLog() {
		return log;
	}

	public PacienteBo getPacienteBo() {
		return pacienteBo;
	}


	

	public void setPacienteBo(PacienteBo pacienteBo) {
		this.pacienteBo = pacienteBo;
	}
	
	public abstract void action(NuevoAfiliadoDto nuevoAfiliadoDto);
	
}