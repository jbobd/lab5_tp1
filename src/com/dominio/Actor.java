package com.dominio;

public class Actor {
	private final int ID_ACTOR;
	private String nombre;
	
	static int cont=0;
	
	public Actor(){
		cont ++;
		this.ID_ACTOR=cont;
	}
	public Actor(String Nombre){
		cont ++;
		this.ID_ACTOR=cont;
		this.nombre=Nombre;
	}
	
	
	@Override
	public String toString() {
		return nombre + " | ";
	}



	public int getId_actor() {
		return ID_ACTOR;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}