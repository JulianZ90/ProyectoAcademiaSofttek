package ar.com.softtek.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.opensymphony.xwork2.ActionSupport;
import ar.com.softtek.bo.TurnoBo;
import ar.com.softtek.dto.TurnoDto;

public abstract class  TurnoPacienteAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("TurnoAction: ");
	
	private int idPaciente;
	private List<TurnoDto> turnosDto = new ArrayList<TurnoDto>();
	private TurnoBo turnoBo;

	
	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public List<TurnoDto> getTurnosDto() {
		return turnosDto;
	}

	public void setTurnosDto(List<TurnoDto> turnosDto) {
		this.turnosDto = turnosDto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Logger getLog() {
		return log;
	}

	
	public TurnoBo getTurnoBo() {
		return turnoBo;
	}

	public void setTurnoBo(TurnoBo turnoBo) {
		this.turnoBo = turnoBo;
	}

	public String execute() {

		try {

			log.info("Exito al obtener Turnos");
			
			turnosDto = this.turnoBo.getTurnosByIdPaciente(this.getIdPaciente());
			
			return "success";

		} catch (Exception e) {

			log.error("Error al crear nuevo Paciente"+e.getMessage());
			return "error";
		}

	}
	
	
}
