package com.fmunera.ejerciciogenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto> {

    private List<T> productos;
    private Integer max;

    public BolsaSupermercado(Integer max) {
        this.max = max;
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto){

        if(this.productos.size() <= max) this.productos.add(producto);
        else throw new RuntimeException("no hay más espacio.");

    }

    public List<T> getProductos(){
        return this.productos;
    }
}
