public class Vendedor extends Persona {
    private String areaDeVentas;

    public Vendedor(String nombre, int id, String areaDeVentas) {
        super(nombre, id);
        this.areaDeVentas = areaDeVentas;
    }

    public String getAreaDeVentas() {
        return areaDeVentas;
    }


}

