// Usiel Figueroa
// February 11, 2025
// M10: Programming Assignment - CSD402-A311 Java for Programmers

// Abstract Division class
abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
