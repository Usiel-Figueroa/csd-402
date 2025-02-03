// Usiel Figueroa
// January 27, 2025
// CSD402-A311 Java for Programmers - M7: Programming Assignment

// References:
// (n.d.). Java Tutorial. W3schools.com. Retrieved January 15, 2025, from https://www.w3schools.com/java/ 
// [Design And Development]. (2020, November 9). Objects Classes [Video]. Bellevue University. https://bellevue.mediaspace.kaltura.com/media/Objects+Classes/1_p7aax14g 
// Replit. (n.d.). How to use the Scanner class in Java. Retrieved January 15, 2025,

import java.util.ArrayList;
import java.util.List;

/**
 * The UseFans class demonstrates creating and managing Fan instances.
 */
public class UseFans {

    public static void main(String[] args) {
        // Create a collection of Fan instances
        List<Fan> fans = new ArrayList<>();
        fans.add(new Fan(Fan.FAST, true, 10.0, "black"));
        fans.add(new Fan(Fan.MEDIUM, false, 7.5, "green"));
        fans.add(new Fan(Fan.SLOW, true, 9.0, "yellow"));

        // Display all fans without using toString()
        displayFans(fans);

        // Display a single fan without using toString()
        displayFan(fans.get(0));
    }

    /**
     * Displays details of all Fan instances in the collection without using toString().
     * @param fans List of Fan objects
     */
    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    /**
     * Displays details of a single Fan instance without using toString().
     * @param fan Fan object to display
     */
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details: ");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }
}

/**
 * The Fan class represents a fan with adjustable speed, color, and radius.
 */
class Fan {
    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor that initializes default values.
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    /**
     * Constructor with parameters to initialize the fan's attributes.
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter methods using 'this' reference
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
