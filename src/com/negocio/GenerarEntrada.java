package com.negocio;

import com.dominio.Entrada;
import com.negocio.interfaz.IGenerarEntrada;

public class GenerarEntrada implements IGenerarEntrada{
	
	@Override
	public void crearEntrada(Entrada nueva) {
		
		nueva.calcularValor();
		System.out.println(nueva.toString());
		
	}
}

