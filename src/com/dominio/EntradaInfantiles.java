package com.dominio;

import java.sql.Date;
import java.sql.Time;

public class EntradaInfantiles extends Entrada {

	private boolean mayor;
	private boolean souvenir;
	
	public EntradaInfantiles(){}
	public EntradaInfantiles(boolean mayor, boolean souvenir, String nombre, Time horario, Date fecha, Time duracion){
		super(nombre, horario, fecha, duracion);
		this.mayor=mayor;
		this.souvenir=souvenir;
	}
	@Override
	public void calcularValor() {
		if(mayor) {
			this.setValor(500);
		}else {
			this.setValor(250);
		}
	}
	public void setEdad(boolean mayor) {
		this.mayor=mayor;
	}
	public boolean getEdad() {
		return mayor;
	}
}
