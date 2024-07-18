package com.gmail.dzhaparov;

import java.util.Random;

public class ArrayTask {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            int randomValue = random.nextInt(-100, 100);
            intArray[i] = randomValue;
        }


        printArray(intArray);
        findSumNegative(intArray);
        countEvenOdd(intArray);
        findBiggestSmallest(intArray);
        findAverageAfterFirstNegative(intArray);

    }

    public static void printArray(int[] array) {
        System.out.print("Eлементи масиву: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void findSumNegative(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i < 0) {
                sum += i;
            }
        }
        System.out.println("\nСума усіх відʼємних чисел в масиві: " + sum);
    }

    public static void countEvenOdd(int[] array) {
        int numberOfOdd = 0;
        int numberOfEven = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                numberOfEven += 1;
            } else {
                numberOfOdd += 1;
            }
        }

        System.out.println("Кількість парних чисел: " + numberOfEven);
        System.out.println("Кількість непарних чисел: " + numberOfOdd);
    }

    public static void findBiggestSmallest(int[] array) {
        int biggestNumber = array[0];
        int biggestNumberIndex = 0;
        int smallestNumber = array[0];
        int smallestNumberIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
                biggestNumberIndex = i;
            }
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                smallestNumberIndex = i;
            }
        }


        System.out.printf("Найменший елемент: %d (з індексом %d)\n", smallestNumber, smallestNumberIndex);
        System.out.printf("Найбільший елемент: %d (з індексом %d)\n", biggestNumber, biggestNumberIndex);


    }

    public static void findAverageAfterFirstNegative(int[] array) {
        int firstNegativeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("В масиві немає від'ємних чисел.");
            return;
        }


        int sum = 0;
        int count = 0;

        for (int i = firstNegativeIndex + 1; i < array.length; i++) {
            sum += array[i];
            count++;
        }

        if (count == 0) {
            System.out.println("Після першого від'ємного числа немає чисел.");
        } else {
            double average = (double) sum / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f\n", average);
        }
    }


}
