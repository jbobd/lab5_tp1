package com.dominio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.ListIterator;

import com.dominio.enums.EGeneroTeatro;

public class EntradaTeatro  extends Entrada {

	private EGeneroTeatro genero;
	private ArrayList<Actor> actores = new ArrayList<Actor>();
	
	public EntradaTeatro(EGeneroTeatro genero, ArrayList<Actor> actores, String nombre,
			Time horario, Date fecha, Time duracion) 
		{
			super(nombre, horario, fecha, duracion);
			this.genero = genero;
			this.setActores(actores);
		}
	public EGeneroTeatro getGenero() {
		return genero;
	}
	public void setGenero(EGeneroTeatro genero) {
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
		this.setValor(1350.50);
	}
	
	@Override
	public String toString() {
		ListIterator<Actor> ite = actores.listIterator();
		String lista = new String();
		while(ite.hasNext()) {lista += ite.next().toString();} 

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		
		sb.append("Genero: " + genero.name() + "\n");
		sb.append("Actores: " + lista + "\n");

		return sb.toString();
	}
}
