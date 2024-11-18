package org.fmunera.ejercicio.felinos;

import org.fmunera.ejercicio.Mamifero;

abstract public class Felino extends Mamifero{

    protected double tamañoGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamañoGarras = tamañoGarras;
        this.velocidad = velocidad;
    }

}
