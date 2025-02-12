// Usiel Figueroa
// February 11, 2025
// M10: Programming Assignment - CSD402-A311 Java for Programmers

// References 
// (n.d.). Java Tutorial. W3schools.com. Retrieved January 15, 2025, from https://www.w3schools.com/java/ 

// Liang, Y. D. (n.d.). Introduction to Java Programming and Data Structures, Comprehensive Version. 



// Main application to test the classes
public class UseDivision {
    public static void main(String[] args) {
        // Creating instances of InternationalDivision
        InternationalDivision intDiv1 = new InternationalDivision("Pacifico", 231, "Mexico", "Spanish");
        InternationalDivision intDiv2 = new InternationalDivision("Samsung", 102, "South Korea", "Korean");

        // Creating instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("Apple", 6, "California");
        DomesticDivision domDiv2 = new DomesticDivision("Hilton", 35, "Virginia");

        // Display division details
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
