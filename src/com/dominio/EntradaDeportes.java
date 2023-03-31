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
	/// Calcula valor de la entrada en función del deporte y el tipo de evento
	@Override
	public void calcularValor() {
		this.setValor(0);
		if(deporte.equalsIgnoreCase("futbol")){this.setValor(300);}
		if(deporte.equalsIgnoreCase("rugby")){this.setValor(450);}
		if(deporte.equalsIgnoreCase("hockey")){this.setValor(380);}
		if(internacional) {this.setValor(getValor()*1.3);}
	}
	/// Metodo toString() con llamado al mismo método de Entrada
	@Override
	public String toString() {
		return super.toString() +
			   "Es internacional: " + internacional + "\n" +
			   "Deporte: " + deporte + "\n";
	}
}
