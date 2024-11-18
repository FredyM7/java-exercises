package org.fmunera.ejercicio.felinos;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamañoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.especieTigre = especieTigre;
    }


    @Override
    public String comer() {
        return "El tigre de nombre científico '"+nombreCientifico+"' y especie " + especieTigre + " está cazando y comiendo en silencio con sus garras de tamaño de "+tamañoGarras+" cm en su habitat de "+habitat+".";
    }

    @Override
    public String dormir() {
        return "El tigre de nombre científico '"+nombreCientifico+"' y especie " + especieTigre + " está descansando en su territorio.";
    }

    @Override
    public String correr() {
        return "El tigre de nombre científico '"+nombreCientifico+"' y especie " + especieTigre + " corre ágilmente a través de la selva a una velocidad de "+velocidad+" km/h.";
    }

    @Override
    public String comunicarse() {
        return "El tigre de la especie " + especieTigre + " está emitiendo un rugido suave para comunicarse con otros tigres.";
    }


    @Override
    public String toString() {
        return "Tigre{" +
                "especieTigre='" + especieTigre + '\'' +
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
