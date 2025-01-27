/*
 * Usiel Figueroa
 * January 22, 2025
 * CSD402-A311 Java for Programmers - M5: Programming Assignment
 */

// This program locates the largest and smallest elements in a 2D array and returns their positions.

public class ArrayLocator {
    public static void main(String[] args) {
        // Test with a sample 2D array
        double[][] testArray = {
            {1.5, 2.3, 3.1},
            {4.2, 5.7, 6.8},
            {7.4, 8.9, 9.0}
        };
        
        int[] largest = locateLargest(testArray);
        int[] smallest = locateSmallest(testArray);
        
        System.out.println("Largest element location: [" + largest[0] + "][" + largest[1] + "]");
        System.out.println("Smallest element location: [" + smallest[0] + "][" + smallest[1] + "]");
    }

    // Method to locate the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
