// Usiel Figueroa
// January 07, 2025
// CSD402-A311 Java for Programmers - 
// M3 Programming Assignment

// Sources
// Liang, Y. D. (n.d.). Introduction to Java Programming and Data Structures, Comprehensive Version. Retrieved from https://platform.virdocs.com/read/2229015/18/#/4/2 

// (n.d.). Java Tutorial. W3schools. Retrieved January 7, 2025, from https://www.w3schools.com/java/ 

// Replit. (n.d.). How to create a Java program. Replit. Retrieved January 7, 20




// Purpose: Use nested for loops to display a pyramid pattern with the given format, including the @ symbol.

public class NestedLoopsPattern {
    public static void main(String[] args) {
        // Constants for pattern generation
        final int TOTAL_ROWS = 7;

        // Calculate the maximum width of the pyramid
        int maxNumber = (int) Math.pow(2, TOTAL_ROWS - 1);
        int maxNumberWidth = String.valueOf(maxNumber).length() + 1; // Width of the largest number, including a space
        int pyramidWidth = (TOTAL_ROWS * 2 - 1) * maxNumberWidth;

        // Loop through each row
        for (int row = 0; row < TOTAL_ROWS; row++) {
            // Calculate leading spaces for centering
            int totalSpaces = (TOTAL_ROWS - row - 1) * maxNumberWidth;
            for (int space = 0; space < totalSpaces; space++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            int num = 1;
            for (int i = 0; i <= row; i++) {
                System.out.printf("%" + maxNumberWidth + "d", num);
                num *= 2;
            }

            // Print decreasing numbers
            num /= 4; // Adjust number for decreasing sequence
            for (int i = 0; i < row; i++) {
                System.out.printf("%" + maxNumberWidth + "d", num);
                num /= 2;
            }

            // Print spaces to align '@' symbol to the far right
            int rowWidth = totalSpaces + ((2 * row + 1) * maxNumberWidth);
            for (int space = 0; space < (pyramidWidth - rowWidth); space++) {
                System.out.print(" ");
            }

            // Print '@' symbol
            System.out.println("  @");
        }
    }
}

