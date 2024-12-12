package org.fmunera.datetime.exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//DOB: Date of Birth
public class CalculateAgeExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar fecha de nacimiento en formato (yyyy/MM/dd): ");
        String dobInput = sc.nextLine();

        LocalDate DOB = LocalDate.parse(dobInput, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        Period age = Period.between(DOB, LocalDate.now());
        System.out.printf("Tu edad es de %d años, %d meses y %d dias"
                , age.getYears(), age.getMonths(), age.getDays());
    }
}
