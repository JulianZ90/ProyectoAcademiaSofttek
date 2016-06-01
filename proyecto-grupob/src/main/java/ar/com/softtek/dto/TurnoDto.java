package ar.com.softtek.dto;

public class TurnoDto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private int planMedico;
	private String fechaTurno;
	private String horaTurno;
	private String fechaLlegada;
	private String horaLlegada;
	private String fechaAtencion;
	private String horaAtencion;
	private int importe;
	private String observaciones;
	
	
	public TurnoDto() {}
	
	public TurnoDto(String nombre, String apellido, int planMedico, String fechaTurno, String horaTurno,
			String fechaLlegada, String horaLlegada, String fechaAtencion, String horaAtencion, int importe,
			String observaciones) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.planMedico = planMedico;
		this.fechaTurno = fechaTurno;
		this.horaTurno = horaTurno;
		this.fechaLlegada = fechaLlegada;
		this.horaLlegada = horaLlegada;
		this.fechaAtencion = fechaAtencion;
		this.horaAtencion = horaAtencion;
		this.importe = importe;
		this.observaciones = observaciones;
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
	
	
	
}
