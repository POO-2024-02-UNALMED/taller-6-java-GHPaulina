package vehiculos;

import java.util.*;

public class Fabricante {

    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais nuevoPais) {
        pais = nuevoPais;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricaGanadora = null;
        int maxVentas = Integer.MIN_VALUE;
        int indexGanador = -1;
        List<Fabricante> fabricas = Vehiculo.getFabricas();
        List<Integer> contadores2 = Vehiculo.getContadores2();

        for (int i = 0; i < contadores2.size(); i++) {
            if (contadores2.get(i) > maxVentas) {
                maxVentas = contadores2.get(i);
                indexGanador = i;
            }
        }

        if (indexGanador != -1) {
            fabricaGanadora = fabricas.get(indexGanador);
        }
        return fabricaGanadora;
    }
}
