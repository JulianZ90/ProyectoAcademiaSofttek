package ar.com.softtek.dto;

public class PlanDto implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int descripcion;
	
	
	public PlanDto(int descripcion) {
		
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
