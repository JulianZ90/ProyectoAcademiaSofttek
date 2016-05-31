package ar.com.softtek.dto;

public class PlanMedicoDto implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int descripcion;
	
	
	public PlanMedicoDto(int descripcion) {
		
		this.descripcion = descripcion;
	}
	public int getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
