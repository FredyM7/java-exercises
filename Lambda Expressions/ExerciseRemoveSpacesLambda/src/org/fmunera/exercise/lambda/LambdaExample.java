package org.fmunera.exercise.lambda;

import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {


        Function<String, String> removeSpaces = a -> a.replaceAll("\\s+", "");
        /*  (regex) (\s) representa cualquier carácter de espacio en blanco. Esto incluye espacios, tabulaciones, saltos de línea y otros caracteres considerados como "espacio" en muchos sistemas.   */
        /* (+) es un cuantificador que indica que el patrón anterior (\s) ocurre una o más veces. */

        String message = "  Hola, que    tal, amigo ";
        String result = removeSpaces.apply(message);

        System.out.println("Before:"+ message);
        System.out.println("After:"+ result);

    }
}
