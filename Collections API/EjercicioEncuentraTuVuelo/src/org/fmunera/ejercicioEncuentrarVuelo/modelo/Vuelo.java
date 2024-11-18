package org.fmunera.ejercicioEncuentrarVuelo.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaDeLlegada;
    private Integer cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaDeLlegada, Integer cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaDeLlegada = fechaDeLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public String getFechaDeLLegadaString(){

        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMM yyyy HH:mm", Locale.forLanguageTag("es"));
        return sdf.format(this.fechaDeLlegada);

    }

    public void setFechaDeLlegada(Date fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(Integer cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {

        return  "nombre = '" + nombre + "'\n," +
                "origen = '" + origen + "'\n," +
                "destino = '" + destino + "'\n," +
                "fechaDeLlegada = " + this.getFechaDeLLegadaString() +"\n,"+
                "cantidadPasajeros = " + cantidadPasajeros +"\n";
    }
}
