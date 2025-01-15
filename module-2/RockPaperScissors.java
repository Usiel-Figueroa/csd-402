// Usiel Figueroa 
// January 07, 2025 
// CSD402-A311 Java for Programmers 

// Purpose: A Rock-Paper-Scissors game where the computer makes a random selection, 
// and the user inputs their choice to determine the game's outcome.

// References 

// [Design and Development - Video Production]. (2020, August 27). String [Video]. Bellevue University. https://bellevue.mediaspace.kaltura.com/media/String/1_v8f7a47e 

// Liang, Y. D. (n.d.). Introduction to Java Programming and Data Structures, Comprehensive Version. Retrieved from https://platform.virdocs.com/read/2229015/18/#/4/2 

// (n.d.). Java Tutorial. W3schools. Retrieved January 7, 2025, from https://www.w3schools.com/java/ 


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a scanner for user input and a random object for computer selection
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's selection (1: Rock, 2: Paper, 3: Scissors)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for their selection
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please restart the game and choose 1, 2, or 3.");
            return;
        }

        // Display choices
        System.out.println("Computer's choice: " + choiceToString(computerChoice));
        System.out.println("Your choice: " + choiceToString(userChoice));

        // Determine the winner
        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        // Close scanner
        scanner.close();
    }

    // Helper method to convert choice number to string representation
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
}
