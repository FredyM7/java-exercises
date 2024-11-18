package org.fmunera.ejercicioEncuentrarVuelo.lista;

import org.fmunera.ejercicioEncuentrarVuelo.modelo.Vuelo;

import java.util.*;

public class EjemploEncuentraTuVuelo {

    public static Date crearFecha(int anio, int mes, int dia, int hora, int minuto){

        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes, dia, hora, minuto);
        calendario.set(Calendar.SECOND, 0);

        return calendario.getTime();
    }

    public static void main(String[] args) {

        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo("AAL 933","New York","Santiago", crearFecha(2021, Calendar.AUGUST, 29, 5, 39), 62));
        vuelos.add(new Vuelo("LAT 755","Sao Paulo","Santiago", crearFecha(2021, Calendar.AUGUST, 31, 4, 45), 47));
        vuelos.add(new Vuelo("SKU 621","Rio De Janeiro","Santiago", crearFecha(2021, Calendar.AUGUST, 30, 16, 0), 52));
        vuelos.add(new Vuelo("DAL 147","Atlanta","Santiago", crearFecha(2021, Calendar.AUGUST, 29, 13, 22), 59));
        vuelos.add(new Vuelo("AVA 241","Bogota","Santiago", crearFecha(2021, Calendar.AUGUST, 31, 14, 5), 25));
        vuelos.add(new Vuelo("AMX 10","Mexico City","Santiago", crearFecha(2021, Calendar.AUGUST, 31, 5, 20), 29));
        vuelos.add(new Vuelo("IBE 6833","Londres","Santiago", crearFecha(2021, Calendar.AUGUST, 30, 8, 45), 55));
        vuelos.add(new Vuelo("LAT 2479","Frankfurt","Santiago", crearFecha(2021, Calendar.AUGUST, 29, 7, 41), 51));
        vuelos.add(new Vuelo("SKU 803","Lima","Santiago", crearFecha(2021, Calendar.AUGUST, 30, 10, 35), 48));
        vuelos.add(new Vuelo("LAT 533","Los Ángeles","Santiago", crearFecha(2021, Calendar.AUGUST, 29, 9, 14), 59));
        vuelos.add(new Vuelo("LAT 1447","Guayaquil","Santiago", crearFecha(2021, Calendar.AUGUST, 31, 8, 33), 31));
        vuelos.add(new Vuelo("CMP 111","Panama City","Santiago", crearFecha(2021, Calendar.AUGUST, 31, 15, 15), 29));
        vuelos.add(new Vuelo("LAT 705","Madrid","Santiago", crearFecha(2021, Calendar.AUGUST, 30, 8, 14), 47));
        vuelos.add(new Vuelo("AAL 957","Miami","Santiago", crearFecha(2021, Calendar.AUGUST, 29, 22, 53), 60));
        vuelos.add(new Vuelo("ARG 5091","Buenos Aires","Santiago", crearFecha(2021, Calendar.AUGUST, 31, 9, 57), 32));
        vuelos.add(new Vuelo("LAT 1283","Cancún","Santiago", crearFecha(2021, Calendar.AUGUST, 31, 4, 0), 35));
        vuelos.add(new Vuelo("LAT 579","Barcelona","Santiago", crearFecha(2021, Calendar.AUGUST, 29, 7, 45), 61));
        vuelos.add(new Vuelo("AAL 945","Dallas-Fort Worth","Santiago", crearFecha(2021, Calendar.AUGUST, 30, 7, 12), 58));
        vuelos.add(new Vuelo("LAT 501","París","Santiago", crearFecha(2021, Calendar.AUGUST, 29, 18, 29), 49));
        vuelos.add(new Vuelo("LAT 405","Montevideo","Santiago", crearFecha(2021, Calendar.AUGUST, 30, 15, 45), 39));

        vuelos.sort(Comparator.comparing(Vuelo::getFechaDeLlegada));

        System.out.println("=========LISTADO ORDENADO POR FECHA DE LLEGADA ASCENDENTE==========");
        for(Vuelo vuelo: vuelos){
            System.out.println(vuelo);
        }

        Vuelo ultimoVuelo = vuelos.get(vuelos.size()-1);
        System.out.println("\nEl último vuelo en llegar es "+ultimoVuelo.getNombre()+": "+ultimoVuelo.getOrigen()+", aterriza el "+ultimoVuelo.getFechaDeLLegadaString());

        vuelos.sort(Comparator.comparing(Vuelo::getCantidadPasajeros));

        Vuelo menosPasajeros = vuelos.get(0);
        System.out.println("El vuelo con menor número de pasajeros es "+ menosPasajeros.getNombre()+": "+menosPasajeros.getOrigen()+", con "+menosPasajeros.getCantidadPasajeros()+" pasajeros.");
    }
}
