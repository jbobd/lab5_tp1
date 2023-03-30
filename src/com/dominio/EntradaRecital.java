package com.dominio;

import com.dominio.enums.EGeneroMusical;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.ListIterator;

public class EntradaRecital extends Entrada{

	///ATRIBUTOS
	private boolean esVip;
	private Banda bandaPrincipal;
	private ArrayList<Banda> bandas = new ArrayList<Banda>();
	private EGeneroMusical genero;
	
	///CONSTRUCTORES
	public EntradaRecital() {}

	public EntradaRecital(boolean vip, 
						  Banda bandaPrincipal, 
						  ArrayList<Banda> listaBandas, 
						  EGeneroMusical genero, 
						  String nombre, 
						  Time horario, 
						  Date fecha, 
						  Time duracion) {
							
		super(nombre, horario, fecha, duracion);
		this.esVip=vip;
		this.bandaPrincipal=bandaPrincipal;
		this.genero = genero;
		this.setBandas(listaBandas);		
	}
	
	///GETTERS Y SETTERS
	public boolean getEsVip() {
		return esVip;
	}
	
	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}
	
	public ArrayList<Banda> getBandas() {
		return bandas;
	}
	
	///EL SETTER DE BANDAS SOLO AGREGA LAS DOS PRIMERAS BANDAS DE LA LISTA QUE SE LE PASA POR PARAMETRO
	public void setBandas(ArrayList<Banda> listaBandas) {
		ListIterator<Banda> ite = listaBandas.listIterator();
		while(ite.nextIndex()<2 && ite.hasNext()) {this.bandas.add(ite.next());}
	}
	
	public Banda getBandaPrincipal() {
		return bandaPrincipal;
	}
	
	public void setBandaPrincipal(Banda bandaPrincipal) {
		this.bandaPrincipal = bandaPrincipal;
	}

	public EGeneroMusical getGenero() {
		return genero;
	}

	public void setGenero(EGeneroMusical genero) {
		this.genero = genero;
	}	
	
	///METODO QUE CALCULA EL VALOR TENIENDO EN CUENTA SI ES VIP O NO
	@Override
	public void calcularValor() {
		if(esVip) {
			this.setValor(1500);
		}else {
			this.setValor(800);
		}
	}	
	
	///METODO QUE DEVUELVE UN STRING CON TODOS LOS DATOS DE LA ENTRADA
	@Override
	public String toString() {

		String listaBandas = new String();
		ListIterator<Banda> ite = this.bandas.listIterator();
		while(ite.hasNext()) {listaBandas += ite.next().toString() + " | ";}

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Vip: " + (esVip ? "Si" : "No") + "\n");
		sb.append("Genero: " + this.genero.name() + "\n");
		sb.append("Banda Principal: " + bandaPrincipal + "\n");
		sb.append("Bandas Soporte: " + listaBandas + "\n");

		return sb.toString();
	}
}
