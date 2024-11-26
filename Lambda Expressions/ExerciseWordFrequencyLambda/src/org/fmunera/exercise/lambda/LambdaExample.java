package org.fmunera.exercise.lambda;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {

        Function<String, Map<String, Integer>> wordFrequencyCounter = a -> {

            String[] words = a.replaceAll("[,.]", "").split(" ");

            int max = 0;
            String word = null;

            for (String wordLoop1 : words) {
                int contador = 0;

                for (String wordLoop2 : words) {
                    if (wordLoop1.equalsIgnoreCase(wordLoop2)) {
                        contador++;
                    }
                }

                if (contador > max) {
                    max = contador;
                    word = wordLoop1;
                }
            }

            return Collections.singletonMap(word, max);
        };

        wordFrequencyCounter.apply("El perro juega con el perro mientras el perro ladra y perro corre.\n")
                .forEach((k,v) -> System.out.println("La palabra que más se repite es \""+k+"\" con ["+v+"] ocurrencias."));

    }
}
