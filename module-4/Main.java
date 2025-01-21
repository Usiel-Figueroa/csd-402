// Usiel Figueroa
// January 15, 2025
// M4: Programming Assignment, CSD402-A311 Java for Programmers

// This program demonstrates method overloading to calculate the average of arrays of different data types.

import java.util.Arrays;

public class Main {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test data with arrays of different sizes
        short[] shortArray = {10, 20, 30, 40, 50}; // 5 elements
        int[] intArray = {15, 30, 45}; // 3 elements
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L}; // 6 elements
        double[] doubleArray = {1.5, 2.5, 3.5}; // 3 elements

        // Display results for short array
        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        // Display results for int array
        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        // Display results for long array
        System.out.println("Long array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        // Display results for double array
        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}

