package vehiculos;

import java.util.*;

public class Pais {
	
	private String nombre;

	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre; 
	}
	
	public static Pais paisMasVendedor() {
		Pais paisGanador;
		int valorMayor = 0;
		int indexGanador = 0;
		ArrayList<Pais> paises = Vehiculo.getPaises();
		ArrayList<Integer> contadores = Vehiculo.getContadores();

		// Iteramos sobre los contadores de ventas para encontrar el máximo
		for (int i = 0; i < contadores.size(); i++) {
			// Si encontramos un contador mayor, actualizamos el país ganador
			if (contadores.get(i) > valorMayor) {
				valorMayor = contadores.get(i);
				indexGanador = i;
			}
		}
		
		// Seleccionamos el país ganador en base al índice encontrado
		paisGanador = paises.get(indexGanador);
		
		return paisGanador;
	}
}
