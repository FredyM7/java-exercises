public class NoPerecedero extends Producto {
    private double contenido;
    private int calorias;

    public NoPerecedero(String nombre, double precio, double contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public double getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }


}

