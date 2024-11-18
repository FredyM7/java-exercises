import java.util.Date;

public class Perecedero extends Producto {
    private Date fechaExpiracion;

    public Perecedero(String nombre, double precio, Date fechaExpiracion) {
        super(nombre, precio);
        this.fechaExpiracion = fechaExpiracion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

}

