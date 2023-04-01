package com.dominio;

import java.sql.Date;
import java.sql.Time;

import com.dominio.enums.ETipoDeporte;

public class EntradaDeportes extends Entrada {
	private boolean internacional;
	private ETipoDeporte deporte;
	
	/// constructores
	public EntradaDeportes(){}
	/// Orden: Internacional, tipo de deporte, nombre de evento, horario, fecha, duraci�n.
	public EntradaDeportes(boolean internacional, ETipoDeporte deporte, String nombre, Time horario, Date fecha, Time duracion){
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
	public ETipoDeporte getDeporte() {
		return deporte;
	}
	public void setDeporte(ETipoDeporte deporte) {
		this.deporte = deporte;
	}
	/// Calcula valor de la entrada en funci�n del deporte y el tipo de evento
	@Override
	public void calcularValor() {
		this.setValor(0);
		if(deporte.name().equalsIgnoreCase(ETipoDeporte.FUTBOL.name())){this.setValor(300);}
		if(deporte.name().equalsIgnoreCase(ETipoDeporte.RUGBY.name())){this.setValor(450);}
		if(deporte.name().equalsIgnoreCase(ETipoDeporte.HOCKEY.name())){this.setValor(380);}
		if(internacional) {this.setValor(getValor()*1.3);}
	}
	/// Metodo toString() con llamado al mismo m�todo de Entrada
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		
		sb.append("Es internacional: " + (internacional ? "Si" : "No") + "\n");
		sb.append("Deporte: " + deporte.name() + "\n");

		return sb.toString();
	}
}
