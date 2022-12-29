// Syntax : For Loop
//          for (Initialize; Condition; Increment) {
//                //Code to be executed
//          }


public class ForStatement {
    public static void main(String[] args) {

        // Print the Square of 1 to 10.
        for (int i = 1; i <= 10; i++) {
            squareCal(i);
        }

        // Print the multiplication table of 7.
        for (int i = 1; i <= 10; i++) {
            tableOfSeven(i);
        }

        // Print the multiplication table of 8 in reverse order
        for (int i = 10; i >= 1; i--) {
            tableOfEightReverse(i);
        }
    }

    public static void squareCal(int i) { // Square Calculator
        int j = i * i;
        System.out.println("The Square of " + i + " is : " + j);
    }

    public static void tableOfSeven(int i) { // Table of Seven
        int k = 7 * i;
        System.out.println("7 * " + i + " = " + k);
    }

    public static void tableOfEightReverse(int i) { // Reverse Table of Eight
        int l = 8 * i;
        System.out.println("8 * " + i + " = " + l);
    }
}
