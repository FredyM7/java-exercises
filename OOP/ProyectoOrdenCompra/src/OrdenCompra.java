import java.util.Date;

public class OrdenCompra {

    private static int identificador;
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto;


    public OrdenCompra(String descripcion) {
        this.id = ++identificador;
        this.productos = new Producto[4];
        this.descripcion = descripcion;
    }


    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public OrdenCompra addProducto (Producto producto) {

        if (indiceProducto < this.productos.length) productos[indiceProducto++] = producto;

        return this;
    }

    public int calcularTotalProductos() {

        int suma=0;

        if(this.productos != null) {
            for (int i=0; i<this.productos.length; i++){
                suma += this.productos[i].getPrecio();
            }
        }

        return suma;
    }

    public String verDetalles() {
        StringBuilder sb = new StringBuilder();

        sb.append("Id orden: "+this.getId())
                .append("\nDescripción de la orden: "+this.getDescripcion())
                .append("\nFecha: "+this.getFecha())
                .append("\nCliente: "+this.getCliente())
                .append("\nProductos: ");

        for (Producto p : this.getProductos()){
            sb.append("\n"+p.getFabricante() +" ==> "+p.getNombre()+" :: "+p.getPrecio()+" USD");
        }

        sb.append("\nTotal precio de todos los productos: " +this.calcularTotalProductos()+" USD \n");

        return sb.toString();
    }

}
