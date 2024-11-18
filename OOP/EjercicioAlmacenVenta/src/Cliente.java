public class Cliente extends Persona {
    private String direccion;

    public Cliente(String nombre, int id, String direccion) {
        super(nombre, id);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }


}

