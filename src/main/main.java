package main;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import com.dominio.Actor;
import com.dominio.Banda;
import com.dominio.Entrada;
import com.dominio.EntradaDeportes;
import com.dominio.EntradaInfantiles;
import com.dominio.EntradaRecital;
import com.dominio.EntradaTeatro;
import com.dominio.enums.EGeneroMusical;
import com.dominio.enums.EGeneroTeatro;
import com.dominio.enums.ETipoDeporte;
import com.negocio.GenerarEntrada;
import com.negocio.interfaz.IGenerarEntrada;

public class main {

	public static void main(String[] args) {
		
		/// ENTRADAS INFANTILES
		/// Constructor: MAYOR, SOUVENIR, NOMBRE, HORARIO, FECHA, DURACION
		Entrada ticket1 = new EntradaInfantiles(
							   true,
							   false, 
							   "Cumple",
							   Time.valueOf("10:00:00"), 
							   Date.valueOf("2023-03-27"), 
							   Time.valueOf("1:00:00")
							   );

		Entrada ticket2 = new EntradaInfantiles(
							   false,
							   true, 
							   "Cumpleaños",
							   Time.valueOf("18:00:00"), 
							   Date.valueOf("2023-03-29"), 
							   Time.valueOf("2:00:00")
							   );
		
		/// PRECARGA DE ACTORES EN LISTA
		ArrayList<Actor> listaActores = new ArrayList<Actor>();
		listaActores.add(new Actor("Actor1"));
		listaActores.add(new Actor("Actor2"));
		listaActores.add(new Actor("Actor3"));
		listaActores.add(new Actor("Actor4"));
		listaActores.add(new Actor("Actor5"));
		
		/// ENTRADAS TEATRO
		/// Constructor: GENERO, ACTORES, NOMBRE, HORARIO, FECHA, DURACION
		Entrada ticket3 = new EntradaTeatro(
							   EGeneroTeatro.COMEDIA,
							   listaActores,
							   "Obra 1",
							   Time.valueOf("18:00:00"), 
							   Date.valueOf("2023-03-29"), 
							   Time.valueOf("2:00:00")
							   );
		
		/// PRECARGA DE BANDAS EN LISTA
		Banda bandaPrincipal1 = new Banda("La Renga");
		Banda bandaPrincipal2 = new Banda("ACDC");
		ArrayList<Banda> bandasSoporte1 = new ArrayList<Banda>();
		bandasSoporte1.add(new Banda("Banda1"));
		bandasSoporte1.add(new Banda("Banda2"));
		ArrayList<Banda> bandasSoporte2 = new ArrayList<Banda>();
		bandasSoporte2.add(new Banda("Banda3"));
		bandasSoporte2.add(new Banda("Banda4"));
		
		/// ENTRADAS RECITALES
		/// Constructor: VIP, BANDA PRINCIPAL, BANDAS SOPORTE, GENERO, NOMBRE, HORARIO, FECHA, DURACION
		Entrada ticket4 = new EntradaRecital(
								true,
								bandaPrincipal1,
								bandasSoporte1,
								EGeneroMusical.ROCK,
								"Labopalooza",
								Time.valueOf("18:00:00"),
								Date.valueOf("2023-03-30"), 
								Time.valueOf("4:00:00")
								);
		
		
		Entrada ticket5 = new EntradaRecital(
								false,
								bandaPrincipal2,
								bandasSoporte2,
								EGeneroMusical.HEAVY_METAL,
								"Labopalooza",
								Time.valueOf("20:00:00"),
								Date.valueOf("2023-04-02"), 
								Time.valueOf("4:00:00")
								);

		/// ENTRADAS DEPORTES
		/// Constructor: INTERNACIONAL, DEPORTE, NOMBRE, HORARIO, FECHA, DURACION
		Entrada ticket6 = new EntradaDeportes(
								false,
								ETipoDeporte.FUTBOL,
								"Partido 1",
								Time.valueOf("20:00:00"),
								Date.valueOf("2023-04-02"), 
								Time.valueOf("2:00:00")
								);
		
		Entrada ticket7 = new EntradaDeportes(
								true,
								ETipoDeporte.FUTBOL,
								"Partido 2",
								Time.valueOf("20:00:00"), 
								Date.valueOf("2023-04-02"), 
								Time.valueOf("4:00:00")
								);
		
		Entrada ticket8 = new EntradaDeportes(
								false,
								ETipoDeporte.RUGBY,
								"Partido 3",
								Time.valueOf("20:00:00"), 
								Date.valueOf("2023-04-02"), 
								Time.valueOf("4:00:00")
								);
		
		Entrada ticket9 = new EntradaDeportes(
								false,
								ETipoDeporte.HOCKEY,
								"Partido 4",
								Time.valueOf("20:00:00"), 
								Date.valueOf("2023-04-02"), 
								Time.valueOf("4:00:00")
								);

		IGenerarEntrada Negocio = new GenerarEntrada();
		/// CREACION DE ENTRADAS
		Negocio.crearEntrada(ticket1);		
		Negocio.crearEntrada(ticket2);
		Negocio.crearEntrada(ticket3);		
		Negocio.crearEntrada(ticket4);		
		Negocio.crearEntrada(ticket5);		
		Negocio.crearEntrada(ticket6);		
		Negocio.crearEntrada(ticket7);		
		Negocio.crearEntrada(ticket8);		
		Negocio.crearEntrada(ticket9);		
	}
}