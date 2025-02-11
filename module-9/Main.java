// Usiel Figueroa
// February 2, 2025
// CSD402-A311 Java for Programmers
// M9: Programming Assignment

/**
References 
(n.d.). Java Tutorial. W3schools.com. Retrieved January 15, 2025, from https://www.w3schools.com/java/ 

(n.d.). Inheritance. Oracle. Retrieved February 2, 2025, from https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html 

(n.d.). Java HashMap. W3schools.com. Retrieved February 2, 2025, from https://www.w3schools.com/java/java_hashmap.asp 

[Design And Development]. (2020, November 9). Objects Classes [Video]. Bellevue University. https://bellevue.mediaspace.kaltura.com/media/Objects+Classes/1_p7aax14g 

X-Men: Characters. (n.d.). Wikipedia. Retrieved February 2, 2025, from https://en.
 */


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        programOne();
        programTwo();
    }

    // Program 1: ArrayList with Exception Handling and Autoboxing
    public static void programOne() {
        System.out.println("Program 1: ArrayList Demonstration");
        List<String> xMen = new ArrayList<>(Arrays.asList(
                "Wolverine", "Cyclops", "Storm", "Jean Grey", "Beast", "Rogue", "Gambit", "Nightcrawler", "Colossus", "Iceman"));

        for (String hero : xMen) {
            System.out.println(hero);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-9) to retrieve an element: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()); // Auto-unboxing
            System.out.println("You selected: " + xMen.get(index));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception: Out of Bounds");
        }
    }

    // Program 2: File Handling with Random Number Generation
    public static void programTwo() {
        System.out.println("\nProgram 2: File Handling Demonstration");
        String filename = "data.file";
        Random random = new Random();

        try (FileWriter fw = new FileWriter(filename, true); BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // Generates a random number between 0-99
                bw.write(num + " ");
            }
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and display file content
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Contents of " + filename + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

