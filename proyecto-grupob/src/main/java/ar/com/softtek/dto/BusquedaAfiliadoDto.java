package ar.com.softtek.dto;

public class BusquedaAfiliadoDto {
	
	private int numdocumento;
	private int numafiliado;
	private int plan;
	private String apenom;
	public int getNumdocumento() {
		return numdocumento;
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
	
	public BusquedaAfiliadoDto(int numdocumento, int numafiliado, int plan, String apenom) {
		this.numdocumento = numdocumento;
		this.numafiliado = numafiliado;
		this.plan = plan;
		this.apenom = apenom;
	}
	
	
	
	
	

}
