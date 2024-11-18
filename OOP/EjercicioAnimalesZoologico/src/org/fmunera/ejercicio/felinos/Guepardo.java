package org.fmunera.ejercicio.felinos;

public class Guepardo extends Felino {


    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo está comiendo después de una veloz caza, con su altura de "+altura+" m y peso de "+peso+" kg.";
    }

    @Override
    public String dormir() {
        return "El guepardo '"+nombreCientifico+"' está descansando bajo la sombra de un árbol, recuperando energía, en su habitat de"+habitat+".";
    }

    @Override
    public String correr() {
        return "El guepardo está corriendo a gran velocidad, alcanzando hasta "+velocidad+" km/h, con sus garras de "+tamañoGarras+"cm y largo de "+largo+" m.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo emite sonidos agudos para comunicarse con otros miembros de su especie.";
    }


    @Override
    public String toString() {
        return "Guepardo{" +
                "tamañoGarras=" + tamañoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
