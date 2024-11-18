package org.fmunera.proyectocatalogo.modelo;

public class TvLcd extends Electronico{

    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return this.pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio()*0.8;
    }
}
