package ar.com.softtek.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.softtek.bo.PacienteBo;
import ar.com.softtek.dto.NuevoAfiliadoDto;


public class BusquedaPacienteAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final Logger log = LogManager.getLogger("NuevoAfiliadoAction: ");
	private static final long serialVersionUID = 1L;
	private int numdocumento;
	private int numafiliado;
	private int plan;
	private String apenom;
	
	private PacienteBo pacienteBo;
//	private PacienteBuscadoDto pacienteBuscadoDto;
	
	
	
	
	public int getNumdocumento() {
		return numdocumento;
	}
	public PacienteBo getPacienteBo() {
		return pacienteBo;
	}
	public void setPacienteBo(PacienteBo pacienteBo) {
		this.pacienteBo = pacienteBo;
	}
	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}
	public int getNumafiliado() {
		return numafiliado;
	}
	public void setNumafiliado(int numafiliado) {
		this.numafiliado = numafiliado;
	}
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public String getApenom() {
		return apenom;
	}
	public void setApenom(String apenom) {
		this.apenom = apenom;
	}
	

	
//	public String execute() {
//
//		try {
//
//			log.info("Exito al crear nuevo Paciente");
//
//			
////			BusquedaAfiliadoDto afiliadoBuscadoDto = new BusquedaAfiliadoDto()
////			
////			NuevoAfiliadoDto nuevoAfiliadoDto = new NuevoAfiliadoDto(this.getNombre(), this.getApellido(), this.getNumdocumento(),
////					this.getTipodoc(), this.getTelefono(), this.getMail(), this.getFechanac(), this.getSexo(),
////					this.getEstadocivil(),
////					(this.getCalle() + this.getAltura() + this.getPiso() + this.getDepartamento()), this.getCanthijos(),
////					this.nuevoPlanMedico());
////
////		System.out.println("El pacienteDto creado es:");
////			
////			System.out.println(nuevoAfiliadoDto.toString());
////			
////			this.action(nuevoAfiliadoDto);
////			
////			
////			return "success";
//
//		} catch (Exception e) {
//
//			log.error("Error al crear nuevo Paciente"+e.getMessage());
//			return "error";
//		}

	}

	
	

