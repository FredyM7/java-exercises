package org.fmunera.api.stream.exercise;

import java.util.Arrays;
import java.util.OptionalDouble;

public class NumberTransformationExample {
    public static void main(String[] args) {


        int[] numbers = new int[100];

        for(int i=1; i<=numbers.length; i++){
            numbers[i-1] = i;
        }

        OptionalDouble num = Arrays.stream(numbers)
                .filter(n -> !(n%10==0))
                .mapToDouble(n -> (double) n/2)
                .reduce(Double::sum);

        System.out.println(num.orElse(0));

    }
}
