/*
 * Usiel Figueroa
 * February 22, 2025
 * M12: Programming Assignment - Yearly Auto Service Cost Calculator
 *
 * This program calculates the cost of a yearly auto service visit using method overloading.
 */

// YearlyServiceTest.java
public class YearlyServiceTest {
    public static void main(String[] args) {
        // Testing each method twice
        System.out.println("Test 1: Standard Service Cost: $" + YearlyService.yearlyService());
        System.out.println("Test 2: Standard Service Cost: $" + YearlyService.yearlyService());

        System.out.println("Test 3: Standard + Oil Change Cost: $" + YearlyService.yearlyService(true));
        System.out.println("Test 4: Standard + Oil Change Cost: $" + YearlyService.yearlyService(false));

        System.out.println("Test 5: Standard + Oil Change + Tire Rotation Cost: $" + YearlyService.yearlyService(true, true));
        System.out.println("Test 6: Standard + Oil Change + Tire Rotation Cost: $" + YearlyService.yearlyService(true, false));

        System.out.println("Test 7: Standard + Oil Change + Tire Rotation - Coupon: $" + YearlyService.yearlyService(true, true, 20.0));
        System.out.println("Test 8: Standard + Oil Change + Tire Rotation - Coupon: $" + YearlyService.yearlyService(false, false, 25.0));
    }
}
