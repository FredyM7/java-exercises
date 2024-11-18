package org.fmunera.ejercicio;

abstract public class Mamifero {

    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }


    abstract public String comer();

    abstract public String dormir();

    abstract public String correr();

    abstract public String comunicarse();
}
