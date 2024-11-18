package org.fmunera.ejercicio.caninos;

import org.fmunera.ejercicio.Mamifero;

abstract public class Canino extends Mamifero{

    protected String color;
    protected double tamañoColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamañoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }


}
