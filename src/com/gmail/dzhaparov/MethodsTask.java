package com.gmail.dzhaparov;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter an Integer: ");
        int numberForSquare = scanner.nextInt();
        System.out.println("1. Square of the " + numberForSquare + " equal to " + square(numberForSquare));
        System.out.println();

        System.out.print("Enter a radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter a height of the cylinder: ");
        double height = scanner.nextDouble();
        System.out.printf("2. The volume of a cylinder with a radius of %.2f and a height of %.2f is %f%n", radius, height, volumeCylinder(height, radius));
        System.out.println();

        int[] numbersArray = new int[10];
        fillArray(numbersArray);
        System.out.print("Array of numbers: ");
        printArray(numbersArray);
        System.out.println("3. Sum of all elements of array equals to " + sumOfElements(numbersArray));
        System.out.println();


        scanner.nextLine();

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.println("4. Reversed string is " + reverseString(inputString));
        System.out.println();

        System.out.print("Enter the first number (a): ");
        int baseNumber = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int exponentNumber = scanner.nextInt();
        System.out.printf("5. Result %d^%d equals to %d%n", baseNumber, exponentNumber, power(baseNumber, exponentNumber));
        System.out.println();

        System.out.print("Enter integer n: ");
        int repeatCount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the string: ");
        String textToRepeat = scanner.nextLine();
        System.out.println("6. Repeated text:");
        printRepeatedText(repeatCount, textToRepeat);
    }

    static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomElement = random.nextInt(50) + 1;
            array[i] = randomElement;
        }
    }

    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int square(int number) {
        return number * number;
    }

    static double volumeCylinder(double height, double radius) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    static int sumOfElements(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    static String reverseString(String inputString) {
        char[] charArray = inputString.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;


            left++;
            right--;
        }

        return new String(charArray);
    }

    static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static void printRepeatedText(int repeatCount, String text) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }
}
