package org.fmunera.api.stream.exercise;

import java.util.Arrays;
import java.util.function.Function;

public class MaxValueExample {
    public static void main(String[] args) {

        Function<Integer[], Integer> maxArrayNumber = array -> Arrays.stream(array)
                .reduce(0, (a, b) -> a>b ? a:b);

        System.out.println(maxArrayNumber.apply(new Integer[]{1552,554,12,0,-775845,622,77415}));

        /*Integer[] numbers = {1,51,20,737,5155,2,5741,6815,515,51,51561566};

        int max = Arrays.stream(numbers)
                .reduce(0, (a,b) -> a>b ? a:b);

        System.out.println(max);
        */
    }
}
