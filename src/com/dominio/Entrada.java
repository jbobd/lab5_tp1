package com.dominio;

import java.sql.Date;
import java.sql.Time;

public abstract class Entrada {
	
	//Atributos
	private final int ID;
	private String nombre;
	private Date fecha;
	private Time horario;
	private Time duracion;
	private double valor;
	
	static int cont=0;
	
	//Constructores
	public Entrada(){
		cont ++;
		this.ID=cont;
	}
	public Entrada(String Nombre, Time Horario, Date Fecha, Time Duracion){
		cont ++;
		this.ID=cont;
		this.nombre=Nombre;
		this.fecha = Fecha;
		this.horario=Horario;
		this.duracion=Duracion;
	}
	
	//Getters y Setters
	public int getID() {
		return ID;
	}
	public void setNombre(String Nombre) {
		this.nombre=Nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setFecha(Date Fecha) {
		this.fecha = Fecha;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setHorario(Time Horario) {
		this.horario=Horario;
	}
	public Time getHorario() {
		return horario;
	}
	public void setDuracion(Time Duracion) {
		this.duracion=Duracion;
	}
	public Time getDuracion() {
		return duracion;
	}
	public void setValor(double Valor) {
		this.valor=Valor;
	}
	public double getValor() {
		return valor;
	}
	
	//Metodo ToString
	@Override
	public String toString() {
		return "ID Entrada: " + ID + "\n"
				+ "Nombre del show: " + nombre + "\n"
				+ "Fecha: " + fecha.toString() + "\n"
				+ "Horario: " + horario.toString() + "\n"
				+ "Duracion: " + duracion.toString() + "\n"
				+ "Valor: $" + valor + "\n";
			}
	
	public abstract void calcularValor();
	
}
