package ar.com.softtek.dto;

public class PlanDto implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String descripcion;
	
	
	public PlanDto(String descripcion) {
		
		this.descripcion = descripcion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
