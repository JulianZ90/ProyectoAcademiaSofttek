package ar.com.softtek.dto;

import java.util.Date;

import com.sun.jmx.snmp.Timestamp;

public class BajaAfiliadoDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int numdocumento;
	private String tipodoc;
	private String horabaja;

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

	public String getHorabaja() {
		return horabaja;
	}

	public void setHorabaja(String horabaja) {
		this.horabaja = horabaja;
	}

	public BajaAfiliadoDto(int numdocumento, String tipodoc, String horabaja) {

		this.numdocumento = numdocumento;
		this.tipodoc = tipodoc;
		this.horabaja = horabaja;
	}

	@Override
	public String toString() {
		return "BajaAfiliadoDto [numdocumento=" + numdocumento + ", tipodoc=" + tipodoc + ", horabaja=" + horabaja
				+ "]";
	}

}
