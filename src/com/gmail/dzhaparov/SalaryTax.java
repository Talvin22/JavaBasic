package com.gmail.dzhaparov;

import java.util.Scanner;

public class SalaryTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salary = scanner.nextInt();
        float taxPercent = 0;
        double tax = 0;
        double netSalary = 0;

        scanner.close();

        if (salary >= 0 && salary <= 10_000) {
            taxPercent = 2.5f;
            tax = (taxPercent / 100) * salary;
            netSalary = salary - tax;
        } else if (salary > 10_000 && salary <= 25_000) {
            taxPercent = 4.3f;
            tax = (taxPercent / 100) * salary;
            netSalary = salary - tax;
        } else if (salary > 25_000) {
            taxPercent = 6.7f;
            tax = (taxPercent / 100) * salary;
            netSalary = salary - tax;
        }


        System.out.printf("Salary before taxes: %d \n" +
                "Tax was: %.1f (%.2f) \n" +
                "Salary after taxes: %.2f", salary, taxPercent, tax, netSalary);


    }
}
