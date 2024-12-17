package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
    
    private int ejes;
    private static ArrayList<Camion> listadoCamiones = new ArrayList<Camion>();
    
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        agregarCamion(this);
    }
    
    public int getEjes() {
        return ejes;
    }
    
    public void setEjes(int nuevosEjes) {
        ejes = nuevosEjes;
    }
    
    // Método que agrega el camión a la lista
    private void agregarCamion(Camion camion) {
        listadoCamiones.add(camion);
    }
    
    // Método que devuelve la cantidad de camiones
    public static int cantidadCamiones() {
        return listadoCamiones.size();
    }
}
