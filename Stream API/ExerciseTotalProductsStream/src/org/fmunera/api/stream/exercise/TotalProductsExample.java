package org.fmunera.api.stream.exercise;

import org.fmunera.api.stream.exercise.models.Product;

import java.util.Arrays;
import java.util.List;

public class TotalProductsExample {
    public static void main(String[] args) {


        Product p1 = new Product(23500, 5);
        Product p2 = new Product(1420, 10);
        Product p3 = new Product(45500, 2);
        Product p4 = new Product(2500, 20);

        List<Product> products = Arrays.asList(p1, p2, p3, p4);

        double total = products.stream()
                .mapToDouble(p -> p.getPrice()*p.getQuantity())
                .sum();

        System.out.println(total);
    }
}
