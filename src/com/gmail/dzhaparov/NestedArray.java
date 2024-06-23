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

        System.out.println("Sum of numbers in even rows: " + sumRows(array, 0));
        System.out.println("Sum of numbers in odd rows: " + sumRows(array, 1));
        System.out.println("Product of numbers in even columns: " + productColumns(array, 0));
        System.out.println("Product of numbers in odd columns: " + productColumns(array, 1));

        if (isMagicSquare(array)) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }

    protected static void fillArray(int[][] matrix) {
        Random random = new Random();
        for (int[] array : matrix) {
            for (int j = 0; j < array.length; j++) {
                int randomNumber = random.nextInt(50) + 1;
                array[j] = randomNumber;
            }
        }
    }

    protected static void printArray(int[][] matrix) {
        for (int[] array : matrix) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }

    protected static int sumRows(int[][] matrix, int initial) {
        int sum = 0;
        for (int i = initial; i < matrix.length; i += 2) {
            for (int j : matrix[i]) {
                sum += j;
            }
        }
        return sum;
    }

    protected static BigInteger productColumns(int[][] matrix, int initial) {
        BigInteger product = BigInteger.ONE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = initial; j < matrix[i].length; j += 2) {
                product = product.multiply(BigInteger.valueOf(matrix[i][j]));

            }
        }
        return product;
    }

    protected static boolean isMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int rowSum = 0;
        int columnSum = 0;


        int referenceSum = 0;
        for (int j = 0; j < size; j++) {
            referenceSum += matrix[0][j];
        }


        for (int i = 0; i < size; i++) {
            rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != referenceSum) {
                return false;
            }
        }


        for (int j = 0; j < size; j++) {
            columnSum = 0;
            for (int i = 0; i < size; i++) {
                columnSum += matrix[i][j];
            }
            if (columnSum != referenceSum) {
                return false;
            }
        }


        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][size - i - 1];
        }

        return primaryDiagonalSum == referenceSum && secondaryDiagonalSum == referenceSum;
    }

}
