package org.fmunera.api.stream.exercise;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {


        String[][] languages = {{"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"}};

        String[] result = Arrays.stream(languages)
                .flatMap(Stream::of)
                .distinct()
                .toArray(String[]::new);

        for(String x: result) System.out.print(x + " ");


    }
}
