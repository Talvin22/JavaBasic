package com.gmail.dzhaparov;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class NestedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int arraySize = scanner.nextInt();
        int[][] array = new int[arraySize][arraySize];

        fillArray(array);
        System.out.println("Matrix: ");
        printArray(array);

        System.out.println("Sum of numbers in even rows: " + sumRows(array, true));
        System.out.println("Sum of numbers in odd rows: " + sumRows(array, false));
        System.out.println("Product of numbers in even columns: " + productColumns(array, true));
        System.out.println("Product of numbers in odd columns: " + productColumns(array, false));

        if (isMagicSquare(array)) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }

    protected static void fillArray(int[][] nestedArray) {
        Random random = new Random();
        for (int[] array : nestedArray) {
            for (int j = 0; j < array.length; j++) {
                int randomNumber = random.nextInt(50) + 1;
                array[j] = randomNumber;
            }
        }
    }

    protected static void printArray(int[][] nestedArray) {
        for (int[] array : nestedArray) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }

    protected static int sumRows(int[][] nestedArray, boolean even) {
        int sum = 0;
        for (int i = 0; i < nestedArray.length; i++) {
            if ((i % 2 == 0) == even) {
                for (int j : nestedArray[i]) {
                    sum += j;
                }
            }
        }
        return sum;
    }

    protected static BigInteger productColumns(int[][] nestedArray, boolean even) {
        BigInteger product = BigInteger.ONE;
        for (int i = 0; i < nestedArray.length; i++) {
            for (int j = 0; j < nestedArray[i].length; j++) {
                if ((j % 2 == 0) == even) {
                    product = product.multiply(BigInteger.valueOf(nestedArray[i][j]));
                }
            }
        }
        return product;
    }

    protected static boolean isMagicSquare(int[][] nestedArray) {
        int size = nestedArray.length;
        int sumDiag1 = 0, sumDiag2 = 0;
        int sumRow = 0, sumCol = 0;


        int sumReference = 0;
        for (int j = 0; j < size; j++) {
            sumReference += nestedArray[0][j];
        }

        for (int i = 0; i < size; i++) {
            sumRow = 0;
            for (int j = 0; j < size; j++) {
                sumRow += nestedArray[i][j];
            }
            if (sumRow != sumReference) {
                return false;
            }
        }


        for (int j = 0; j < size; j++) {
            sumCol = 0;
            for (int i = 0; i < size; i++) {
                sumCol += nestedArray[i][j];
            }
            if (sumCol != sumReference) {
                return false;
            }
        }


        for (int i = 0; i < size; i++) {
            sumDiag1 += nestedArray[i][i];
            sumDiag2 += nestedArray[i][size - i - 1];
        }
        return sumDiag1 == sumReference && sumDiag2 == sumReference;
    }
}
