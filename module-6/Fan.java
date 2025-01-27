// Usiel Figueroa
// January 22, 2025
// CSD402-A311 Java for Programmers - M6: Programming Assignment

// References:
// (n.d.). Java Tutorial. W3schools.com. Retrieved January 15, 2025, from https://www.w3schools.com/java/
// [Design And Development]. (2020, November 9). Objects Classes [Video]. Bellevue University. https://bellevue.mediaspace.kaltura.com/media/Objects+Classes/1_p7aax14g
// Replit.com. (n.d.). How to Create a Java Class. Retrieved January 15, 2025, from https

/**
 * The Fan class represents a fan with adjustable speed, color, and radius.
 */
public class Fan {
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

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a string representation of the fan's state.
     */
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off, Color: " + color + ", Radius: " + radius;
        }
    }

    /**
     * Main method to test the Fan class functionality.
     */
    public static void main(String[] args) {
        // Create fan instances
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(FAST, true, 8.5, "blue");

        // Display default fan state
        System.out.println("Default Fan: " + defaultFan);

        // Display custom fan state
        System.out.println("Custom Fan: " + customFan);

        // Modify and display default fan properties
        defaultFan.setOn(true);
        defaultFan.setSpeed(MEDIUM);
        defaultFan.setColor("red");
        System.out.println("Updated Default Fan: " + defaultFan);
    }
}
