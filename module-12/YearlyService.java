/*
 * Usiel Figueroa
 * February 22, 2025
 * M12: Programming Assignment - Yearly Auto Service Cost Calculator
 *
 * This program calculates the cost of a yearly auto service visit using method overloading.
 */

// YearlyService.java
public class YearlyService {
    // Standard service charge
    private static final double STANDARD_SERVICE = 250.0;
    private static final double OIL_CHANGE_FEE = 50.0;
    private static final double TIRE_ROTATION_FEE = 30.0;

    // Method 1: No parameters - returns standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // Method 2: One parameter - adds oil change fee
    public static double yearlyService(boolean oilChange) {
        return STANDARD_SERVICE + (oilChange ? OIL_CHANGE_FEE : 0);
    }

    // Method 3: Two parameters - adds oil change and tire rotation fees
    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        return STANDARD_SERVICE + (oilChange ? OIL_CHANGE_FEE : 0) + (tireRotation ? TIRE_ROTATION_FEE : 0);
    }

    // Method 4: Three parameters - applies discount coupon to the total cost
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
        double total = STANDARD_SERVICE + (oilChange ? OIL_CHANGE_FEE : 0) + (tireRotation ? TIRE_ROTATION_FEE : 0);
        return total - coupon;
    }
}
