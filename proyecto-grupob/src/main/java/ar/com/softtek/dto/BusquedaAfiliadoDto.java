package ar.com.softtek.dto;

public class BusquedaAfiliadoDto {
	
	private String valorbuscado;
	private String tipodato;
	
	
	public String getTipodato() {
		return tipodato;
	}



	public void setTipodato(String tipodato) {
		this.tipodato = tipodato;
	}



	public String getValorbuscado() {
		return valorbuscado;
	}



	public void setValorbuscado(String valorbuscado) {
		this.valorbuscado = valorbuscado;
	}



	public BusquedaAfiliadoDto(String valorbuscado, String tipodato) {
		this.valorbuscado = valorbuscado;
		this.tipodato = tipodato;
	}



}
