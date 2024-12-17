package vehiculos;

import java.util.*;

public class Camioneta extends Vehiculo {

    private boolean volco;
    private static ArrayList<Camioneta> listaCamionetas = new ArrayList<Camioneta>();

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        agregarCamioneta(this);
    }

    public boolean tieneVolco() {
        return volco;
    }

    public void establecerVolco(boolean volco) {
        this.volco = volco;
    }

    // Método para agregar la camioneta a la lista
    private void agregarCamioneta(Camioneta camioneta) {
        listaCamionetas.add(camioneta);
    }

    // Método para obtener la cantidad de camionetas
    public static int obtenerCantidadCamionetas() {
        return listaCamionetas.size();
    }
}
}