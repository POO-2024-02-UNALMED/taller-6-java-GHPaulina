class Camioneta extends Vehiculo {
    private boolean volco;

    public Camioneta(String placa, double precio, double peso, Fabricante fabricante, boolean volco) {
        super(placa, 4, 90, "Camioneta", precio, peso, "4X4", fabricante);
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}