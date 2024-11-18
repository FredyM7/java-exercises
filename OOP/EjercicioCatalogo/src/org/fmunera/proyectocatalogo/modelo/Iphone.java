package org.fmunera.proyectocatalogo.modelo;

public class Iphone extends Electronico{

    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio()*0.9;
    }


}
