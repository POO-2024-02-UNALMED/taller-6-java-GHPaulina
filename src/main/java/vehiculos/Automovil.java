package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
    
    private int puestos;
    private static ArrayList<Automovil> listadoAutomoviles = new ArrayList<Automovil>();
    
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        agregarAutomovil(this);
    }
    
    public int getPuestos() {
        return puestos;
    }
    
    public void setPuestos(int nuevosPuestos) {
        puestos = nuevosPuestos;
    }
    
    // Método que agrega el automovil a la lista
    private void agregarAutomovil(Automovil automovil) {
        listadoAutomoviles.add(automovil);
    }
    
    // Método que devuelve la cantidad de automóviles
    public static int cantidadAutomoviles() {
        return listadoAutomoviles.size();
    }
}
