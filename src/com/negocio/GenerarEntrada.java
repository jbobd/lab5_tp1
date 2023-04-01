package com.negocio;

import com.dominio.Entrada;
import com.negocio.interfaz.IGenerarEntrada;

public class GenerarEntrada implements IGenerarEntrada{
	
	@Override
	public void crearEntrada(Entrada nueva) {
		///Llama al metodo de la clase correspondiente y asigna el valor.
		nueva.calcularValor();
		///Imprime por consola los datos de la entrada
		System.out.println(nueva.toString());
		
	}
}

