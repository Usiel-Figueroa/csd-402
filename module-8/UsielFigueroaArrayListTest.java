import java.util.ArrayList;
import java.util.Scanner;

/**
 * Usiel Figueroa
 * M8: Programming Assignment
 * CSD402-A311 Java for Programmers
 * February 2, 2025
 * 
 * This program collects integer inputs from the user, stores them in an ArrayList,
 * and determines the largest value entered. If the list is empty, it returns 0.
 */

/** References
(n.d.). Java Tutorial. W3schools.com. Retrieved January 15, 2025, from https://www.w3schools.com/java/

(n.d.). Inheritance. Oracle. Retrieved February 2, 2025, from https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
(n.d.). Java HashMap. W3schools.com. Retrieved February 2, 2025, from https://www.w3schools.com/java/java_hashmap.asp


[Design And Development]. (2020, November 9). Objects Classes [Video]. Bellevue University. https://bellevue.mediaspace.kaltura.com/media/Objects+Classes/1_p7aax14g
    */

public class UsielFigueroaArrayListTest {


    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int maxVal = list.get(0);
        for (int num : list) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");
        while (true) {
            try {
                int input = scanner.nextInt();
                numbers.add(input);
                if (input == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.close();

        // Get the max value from the list and display it
        int maxValue = max(numbers);
        System.out.println("The largest number entered is: " + maxValue);
    }
}
