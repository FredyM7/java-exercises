package org.fmunera.ejercicio.felinos;

public class Leon extends Felino {

    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamañoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león '"+nombreCientifico+"' está comiendo con su manada de " + numManada + " leones en su habitat de "+habitat+".";
    }

    @Override
    public String dormir() {
        return "El león está durmiendo después de rugir con " + potenciaRugidoDecibel + " decibelios.";
    }

    @Override
    public String correr() {
        return "El león está corriendo junto a su manada de " + numManada + " leones.";
    }

    @Override
    public String comunicarse() {
        return "El león se comunica con un rugido de " + potenciaRugidoDecibel + " decibelios que se escucha a kilómetros.";
    }


    @Override
    public String toString() {
        return "Leon{" +
                "numManada=" + numManada +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
                ", tamañoGarras=" + tamañoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
