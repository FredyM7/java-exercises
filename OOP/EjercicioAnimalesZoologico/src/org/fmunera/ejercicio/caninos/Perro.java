package org.fmunera.ejercicio.caninos;

public class Perro extends Canino{

    private int fuerzaMordidaPsi;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamañoColmillos, int fuerzaMordidaPsi) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.fuerzaMordidaPsi = fuerzaMordidaPsi;
    }


    @Override
    public String comer() {
        return "El perro está masticando su comida con sus colmillos de "+tamañoColmillos+" cm y con una fuerza de mordida de " + fuerzaMordidaPsi + " PSI.";
    }

    @Override
    public String dormir() {
        return "El perro está durmiendo plácidamente después de un largo día.";
    }

    @Override
    public String correr() {
        return "El perro está corriendo rápido y libre por el parque.";
    }

    @Override
    public String comunicarse() {
        return "El perro está ladrando para comunicarse, mostrando su energía y fuerza con una mordida de " + fuerzaMordidaPsi + " PSI.";
    }


    @Override
    public String toString() {
        return "Perro{" +
                "fuerzaMordidaPsi=" + fuerzaMordidaPsi +
                ", color='" + color + '\'' +
                ", tamañoColmillos=" + tamañoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
