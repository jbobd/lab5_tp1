package com.dominio;

import java.sql.Date;
import java.sql.Time;

public class EntradaDeportes extends Entrada {
	private boolean internacional;
	private String deporte;
	
	/// constructores
	public EntradaDeportes(){}
	/// Orden: Internacional, tipo de deporte, nombre de evento, horario, fecha, duración.
	public EntradaDeportes(boolean internacional, String deporte, String nombre, Time horario, Date fecha, Time duracion){
		super(nombre, horario, fecha, duracion);
		this.deporte=deporte;
		this.internacional=internacional;
	}	
	
	/// getters y setters
	public boolean isInternacional() {
		return internacional;
	}
	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	@Override
	public void calcularValor() {
	}
}
