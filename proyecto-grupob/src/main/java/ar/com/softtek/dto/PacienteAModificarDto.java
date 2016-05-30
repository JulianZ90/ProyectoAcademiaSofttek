package ar.com.softtek.dto;



public class PacienteAModificarDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int numdocumento;
	private String tipodoc;
	

	public int getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	
	public PacienteAModificarDto(int numdocumento, String tipodoc) {

		this.numdocumento = numdocumento;
		this.tipodoc = tipodoc;
		
	}

	@Override
	public String toString() {
		return "BajaAfiliadoDto [numdocumento=" + numdocumento + ", tipodoc=" + tipodoc + "]";
	}

}
