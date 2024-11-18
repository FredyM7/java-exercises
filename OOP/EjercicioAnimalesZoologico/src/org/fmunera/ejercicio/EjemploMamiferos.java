package org.fmunera.ejercicio;

import org.fmunera.ejercicio.caninos.*;
import org.fmunera.ejercicio.felinos.*;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Sabana", 1.2, 2.5, 190.0, "Panthera leo", 5.0, 80, 12, 114.0);
        Mamifero tigre = new Tigre("Selva", 1.1, 2.8, 220.0, "Panthera tigris", 6.0, 65, "Bengala");
        Mamifero guepardo = new Guepardo("Sabanas Africanas", 0.9, 2.1, 72.0, "Acinonyx jubatus", 4.5, 100);
        Mamifero lobo = new Lobo("Bosque", 0.8, 1.6, 60.0, "Canis lupus", "Gris", 4.0, 5, "Lobo Gris");
        Mamifero perro = new Perro("Doméstico", 0.6, 1.2, 35.0, "Canis lupus familiaris", "Negro", 2.5, 200);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for(Mamifero animal: mamiferos){
            System.out.println((animal));
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse()+"\n");
        }
    }
}
