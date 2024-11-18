package com.fmunera.app.datos;

public class Producto {

    protected String nombre;
    protected Double precio;

    public Producto() {}
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", precio=" + precio;
    }
}
