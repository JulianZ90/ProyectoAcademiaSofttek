package ar.com.softtek.dto;

public class BusquedaAfiliadoDto {
	
	private int valorbuscado;
	private String tipodato;
	
	
	public String getTipodato() {
		return tipodato;
	}



	public void setTipodato(String tipodato) {
		this.tipodato = tipodato;
	}



	public int getValorbuscado() {
		return valorbuscado;
	}



	public void setValorbuscado(int valorbuscado) {
		this.valorbuscado = valorbuscado;
	}



	public BusquedaAfiliadoDto(int valorbuscado, String tipodato) {
		this.valorbuscado = valorbuscado;
		this.tipodato = tipodato;
	}


	

	
	
	
	

}
