package ar.com.softtek.mock.object;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import ar.com.softtek.dto.PacienteDto;
import ar.com.softtek.dto.PlanMedicoDto;

public class MockBajaPacienteAction {
	
	private static final Logger log = LogManager.getLogger("NuevoAfiliadoAction: ");

	private String nombre;
	private String apellido;
	private int nroDoc;
	private String tipoDoc;
	private String telefono;
	private String mail;
	private String fecNac;
	private char sexo;
	private String calle;
	private String estadoCivil;
	private int familiaresACargo;
	private int planMedico;
	private String departamento;
	private String piso;
	private int altura;
	private MockPacienteBo pacienteBo;

	
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

	public int getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(int nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
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

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
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

	public void setFamiliaresACargo(int familiaresACargo) {
		this.familiaresACargo = familiaresACargo;
	}

	public int getPlanMedico() {
		return planMedico;
	}

	public void setPlanMedico(int planMedico) {
		this.planMedico = planMedico;
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

	
	public MockPacienteBo getPacienteBo() {
		return pacienteBo;
	}
	public void setPacienteBo(MockPacienteBo pacienteBo) {
		this.pacienteBo = pacienteBo;
	}
	
	

	public String execute() {

		try {

			log.info("Exito al dar de baja un Paciente");

			PacienteDto PacienteDto = new PacienteDto(this.getNombre(), this.getApellido(), this.getNroDoc(),
					this.getTipoDoc(), this.getTelefono(), this.getMail(), this.getFecNac(), this.getSexo(),
					this.getEstadoCivil(),
					(this.getCalle() + this.getAltura() + this.getPiso() + this.getDepartamento()), this.getFamiliaresACargo(),
					this.nuevoPlanMedico());

			
			System.out.println(PacienteDto.toString());

			this.pacienteBo.deletePaciente(PacienteDto);

			
			return "success";

		} catch (Exception e) {

			log.error("Error al dar de baja un Paciente");
			return "error";
		}

	}

	private PlanMedicoDto nuevoPlanMedico() {
		return (new PlanMedicoDto(this.getPlanMedico()));
	}
}
