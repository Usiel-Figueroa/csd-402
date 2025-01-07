// Usiel Figueroa
// January 07, 2025
// CSD402-A311: Java for Programmers - M1 Programming Assignment

// References 

// Liang, Y. D. (n.d.). Introduction to Java Programming and Data Structures, Comprehensive Version. Retrieved from  https://platform.virdocs.com/read/2229015/18/#/4/2 

// (n.d.). Java Tutorial. W3schools. Retrieved January 7, 2025, from https://www.w3schools.com/java/ 

// This program calculates the energy needed to heat water from an initial temperature to a final temperature.

import java.util.Scanner;

public class WaterHeatingEnergyCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt the user to enter the initial temperature in Celsius
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        // Prompt the user to enter the final temperature in Celsius
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy required using the formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result in Joules
        System.out.printf("The energy needed to heat the water is %.2f Joules.%n", energy);

        // Close the scanner
        scanner.close();
    }
}
