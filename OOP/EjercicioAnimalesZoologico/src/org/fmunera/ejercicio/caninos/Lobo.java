package org.fmunera.ejercicio.caninos;

public class Lobo extends Canino{

    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamañoColmillos, int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }


    @Override
    public String comer() {
        return "El lobo de nombre científico '"+nombreCientifico+"' y especie " + especieLobo + " está devorando su presa junto a su camada de " + numeroCamada + " cachorros, usando sus colmillos de "+tamañoColmillos+" cm.";
    }

    @Override
    public String dormir() {
        return "El lobo de la especie " + especieLobo + " está durmiendo tranquilamente después de cuidar a sus " + numeroCamada + " cachorros.";
    }

    @Override
    public String correr() {
        return "El lobo de la especie " + especieLobo + " está corriendo en manada, liderando a su camada.";
    }

    @Override
    public String comunicarse() {
        return "El lobo de la especie " + especieLobo + " aúlla para comunicarse con su camada de " + numeroCamada + " miembros.";
    }


    @Override
    public String toString() {
        return "Lobo{" +
                "numeroCamada=" + numeroCamada +
                ", especieLobo='" + especieLobo + '\'' +
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
