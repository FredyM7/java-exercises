public class Empleado extends Persona {

    private Double remuneracion;
    private int empleadoId;

    public Empleado(){}
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        double aumento = ((porcentaje/100d)*remuneracion);
        this.remuneracion += aumento;

    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId;
    }
}
