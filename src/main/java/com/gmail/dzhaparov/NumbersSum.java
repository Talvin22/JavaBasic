package com.gmail.dzhaparov;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        int sum = 0;

        scanner.close();

        for (int i = 1; i <= limit; i++) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d \n", i, i, sum);

        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sum);


    }
}
