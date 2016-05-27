package ar.com.softtek.action;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.opensymphony.xwork2.ActionSupport;
import ar.com.softtek.dto.PacienteDto;
import ar.com.softtek.dto.PlanDto;

public class NuevoPacienteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("NuevoPacienteAction: ");

	private String apellido;
	private String nombre;
	private int numdocumento;
	private String tipodoc;
	private int telefono;
	private String mail;
	private Date fechanac;
	private char sexo;
	private String direccion;
	private String estadocivil;
	private int canthijos;
	private String plan;
	private String departamento;
	private String piso;
	private int altura;
		
	public String execute() {

		try {
			
			PacienteDto paciente = new PacienteDto(this.getNombre(), this.getApellido(),this.getNumdocumento(), this.getTipodoc(), this.getTelefono(), this.getMail(), this.getFechanac(), this.getSexo(), this.getEstadocivil(),
					(this.getDireccion()+this.getAltura()+this.getPiso()+this.getDepartamento()), this.getCanthijos(), this.nuevoPlanMedico());

			log.info("Exito al crear nuevo Paciente");
			
		System.out.println(paciente.getPlanMedico().getDescripcion());
		this.toString();
			
			return "success";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("Error al crear nuevo Paciente");
			return "error";
		}

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

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
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
		
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadocivil = estadoCivil;
	}

	public void setCanthijos(int canthijos) {
		this.canthijos = canthijos;
	}

	public void setPlan(String planMedico) {
		this.plan = planMedico;
	}

	
	public String getPlan() {
		return plan;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getMail() {
		return mail;
	}

	public char getSexo() {
		return sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCanthijos() {
		return canthijos;
	}

	public PlanDto nuevoPlanMedico() {
		return (new PlanDto(this.getPlan()));
	}
	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}


	@Override
	public String toString() {
		return "NuevoPacienteAction [apellido=" + apellido + ", nombre=" + nombre + ", numdocumento=" + numdocumento
				+ ", tipodoc=" + tipodoc + ", telefono=" + telefono + ", mail=" + mail + ", fechanac=" + fechanac
				+ ", sexo=" + sexo + ", direccion=" + direccion + ", estadocivil=" + estadocivil + ", canthijos="
				+ canthijos + ", plan=" + plan + ", departamento=" + departamento + ", piso=" + piso + ", altura="
				+ altura + "]";
	}
	
	


}

    

	

