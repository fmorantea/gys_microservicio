package com.gys.ripley.ms.dto;

public class ManifiestoInRO {
	private String piTipEjecucion;
	private Long piManifiesto;
	private Long piTransporte;
	private Integer tipoDato;
	
	public String getPiTipEjecucion() {
		return piTipEjecucion;
	}
	public void setPiTipEjecucion(String piTipEjecucion) {
		this.piTipEjecucion = piTipEjecucion;
	}
	public Long getPiManifiesto() {
		return piManifiesto;
	}
	public void setPiManifiesto(Long piManifiesto) {
		this.piManifiesto = piManifiesto;
	}
	public Long getPiTransporte() {
		return piTransporte;
	}
	public void setPiTransporte(Long piTransporte) {
		this.piTransporte = piTransporte;
	}
	public Integer getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(Integer tipoDato) {
		this.tipoDato = tipoDato;
	}
	
}
