// Usiel Figueroa
// March 8, 2025
// CSD402-A311 Java for Programmers
// Original M9: Programming Assignment
// Redo M12: M9: Programming Assignment
// This version of my code improves user experience by displaying indices next to each X-Men name and providing clearer instructions. I also separated the programs into separate classes for better organization and readability recommended by the professor.

/**
References 
(n.d.). Java Tutorial. W3schools.com. Retrieved January 15, 2025, from https://www.w3schools.com/java/ 

(n.d.). Inheritance. Oracle. Retrieved February 2, 2025, from https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html 

(n.d.). Java HashMap. W3schools.com. Retrieved February 2, 2025, from https://www.w3schools.com/java/java_hashmap.asp 

[Design And Development]. (2020, November 9). Objects Classes [Video]. Bellevue University. https://bellevue.mediaspace.kaltura.com/media/Objects+Classes/1_p7aax14g 

X-Men: Characters. (n.d.). Wikipedia. Retrieved February 2, 2025, from https://en.
 */

import java.util.*;

public class ProgramOne {
    public static void run() {
        System.out.println("Program 1: ArrayList Demonstration");
        List<String> xMen = new ArrayList<>(Arrays.asList(
                "Wolverine", "Cyclops", "Storm", "Jean Grey", "Beast", "Rogue", "Gambit", "Nightcrawler", "Colossus", "Iceman"));

        System.out.println("Here is the list of X-Men characters with their corresponding indices:");
        for (int i = 0; i < xMen.size(); i++) {
            System.out.println(i + ": " + xMen.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-9) to retrieve an element (X-Men character): ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("You selected: " + xMen.get(index));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception: Invalid input. Please enter a number between 0 and 9.");
        }
    }
}
