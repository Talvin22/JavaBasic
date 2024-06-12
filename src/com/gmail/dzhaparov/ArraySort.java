package com.gmail.dzhaparov;

import java.util.Random;
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of size of array: ");
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];
        Random random = new Random();


        for (int i = 0; i < intArray.length; i++) {
            int randomInt = random.nextInt(100) + 1;
            intArray[i] = randomInt;
        }

        System.out.print("Enter the number for searching: ");
        int userNumber = scanner.nextInt();

        System.out.println("Original Array:");
        printArray(intArray);

        insertionSort(intArray);

        System.out.println("Sorted Array:");
        printArray(intArray);

        int searchResult = binarySearch(intArray, userNumber);
        if (searchResult != -1) {
            System.out.println("Number found at index: " + searchResult);
        } else {
            System.out.println("Number not found in the array.");
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
