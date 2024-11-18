package org.fmunera.ejercicio.tarea;

import java.util.concurrent.TimeUnit;

import static org.fmunera.ejercicio.tarea.Tipo.*;
public class EjemploTareaHilos {
    public static void main(String[] args) throws InterruptedException {


        new Thread(new AlfanumericoTarea(NUMERO)).start();
        TimeUnit.MILLISECONDS.sleep(100);
        new Thread(new AlfanumericoTarea(LETRA)).start();

    }

}
