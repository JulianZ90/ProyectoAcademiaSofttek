package ar.com.softtek.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.opensymphony.xwork2.ActionSupport;
import ar.com.softtek.bo.TurnoBo;
import ar.com.softtek.dto.TurnoDto;


public class AltaTurnoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("AltaTurnoAction: ");
	
	private int idTurno;
	private String nombre;
	private String apellido;
	private int idPaciente;
	private int planMedico;
	private String fechaTurno;
	private String horaTurno;
	private String fechaLlegada;
	private String horaLlegada;
	private String fechaAtencion;
	private String horaAtencion;
	private int idPrestador;
	private int idPractica;
	private int importe;
	private String observaciones;
	private TurnoBo turnoBo;
	
	
	
	public TurnoBo getPacienteBo() {
		return turnoBo;
	}
	public void setTurnoBo(TurnoBo turnoBo) {
		this.turnoBo = turnoBo;
	}
	public static Logger getLog() {
		return log;
	}
	public int getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
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
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public int getPlanMedico() {
		return planMedico;
	}
	public void setPlanMedico(int planMedico) {
		this.planMedico = planMedico;
	}
	public String getFechaTurno() {
		return fechaTurno;
	}
	public void setFechaTurno(String fechaTurno) {
		this.fechaTurno = fechaTurno;
	}
	public String getHoraTurno() {
		return horaTurno;
	}
	public void setHoraTurno(String horaTurno) {
		this.horaTurno = horaTurno;
	}
	public String getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public String getHoraLlegada() {
		return horaLlegada;
	}
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	public String getFechaAtencion() {
		return fechaAtencion;
	}
	public void setFechaAtencion(String fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}
	public String getHoraAtencion() {
		return horaAtencion;
	}
	public void setHoraAtencion(String horaAtencion) {
		this.horaAtencion = horaAtencion;
	}
	public int getIdPrestador() {
		return idPrestador;
	}
	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}
	public int getIdPractica() {
		return idPractica;
	}
	public void setIdPractica(int idPractica) {
		this.idPractica = idPractica;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
	public String execute() {

		try {

			log.info("Exito Alta Turno");

            TurnoDto turnoDto = new TurnoDto(getIdPrestador(), getNombre(), getApellido(), getPlanMedico(), getFechaTurno(), getHoraTurno());
			this.turnoBo.addTurno(turnoDto);
			
			return "success";

		} catch (Exception e) {

			log.error("Error Alta Turno"+e.getMessage());
			return "error";
		}

	}
}
