package com.dominio;

public class Banda {

	///ATRIBUTOS
	private final int idBanda;
	private String nombre;	
	
	///CONTADOR PARA ID
	static int cont=0;
	
	///CONSTRUCTORES
	public Banda(){
		cont ++;
		this.idBanda=cont;
	}

	public Banda(String nombre){
		cont ++;
		this.idBanda=cont;
		this.nombre=nombre;
	}	
	
	///GETTERS Y SETTERS
	public int getIdBanda() {
		return idBanda;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
