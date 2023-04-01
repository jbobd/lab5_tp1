package com.dominio;

import java.sql.Date;
import java.sql.Time;

public class EntradaInfantiles extends Entrada {

	// ATTRS
	private boolean mayor;
	private boolean souvenir;
	
	// CONSTRUCTORES
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

	// SETTERS Y GETTERS
	public void setEdad(boolean mayor) {
		this.mayor=mayor;
	}
	public boolean getEdad() {
		return mayor;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir=souvenir;
	}
	public boolean getSouvenir() {
		return souvenir;
	}
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		
		sb.append("Es mayor: " + (mayor ? "Si" : "No")+ "\n");
		sb.append("Souvenir: " + (souvenir ? "Si" : "No") + "\n");

		return sb.toString();
	}
}
