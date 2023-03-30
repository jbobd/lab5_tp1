package com.dominio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.ListIterator;

public class EntradaTeatro  extends Entrada {

	private generoTeatro genero;
	private ArrayList<Actor> actores = new ArrayList<Actor>();
	
	public EntradaTeatro(generoTeatro genero, ArrayList<Actor> actores, String nombre,
			Time horario, Date fecha, Time duracion) 
		{
			super(nombre, horario, fecha, duracion);
			this.genero = genero;
			this.setActores(actores);
		}
	public generoTeatro getGenero() {
		return genero;
	}
	public void setGenero(generoTeatro genero) {
		this.genero = genero;
	}
	public ArrayList<Actor> getActores() {
		return actores;
	}
	public void setActores(ArrayList<Actor> listaActores) {
		ListIterator<Actor> ite = listaActores.listIterator();
		while(ite.nextIndex()<3 && ite.hasNext()) {actores.add(ite.next());}
	}
	
	@Override
	public void calcularValor() {
	}
}
