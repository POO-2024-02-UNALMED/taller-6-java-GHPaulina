class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, double precio, double peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, "Camión", precio, peso, "4X2", fabricante);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}