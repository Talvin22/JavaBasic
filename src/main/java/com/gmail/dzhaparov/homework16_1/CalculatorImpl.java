package com.gmail.dzhaparov.homework16_1;

import com.gmail.dzhaparov.Calculator;

public class CalculatorImpl {
    public static void main(String[] args) {
        System.out.println("Sum of two int numbers: " + Calculator.sum(2, 2));
        System.out.println("Sum of two float numbers: " + Calculator.sum(2.5f, 2.5f));

        System.out.println("Difference of two int numbers: " + Calculator.minus(2, 2));
        System.out.println("Difference of two float numbers: " + Calculator.minus(2.5f, -2.5f));

        System.out.println("Product of two int numbers: " + Calculator.multiply(2, 2));
        System.out.println("Product of two float numbers: " + Calculator.minus(2.5f, -2.5f));

        System.out.println("Quotient of two int numbers: " + Calculator.divide(2, 2));
        System.out.println("Quotient of two float numbers: " + Calculator.divide(2.5f, -2.5f));


    }
}
