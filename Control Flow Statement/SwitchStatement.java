// The switch statement tests the equality of a variable against multiple values.
// Without break, the program continues to the next labeled statements, executing the statements until a break or
// the end of the statement is reached.
public class SwitchStatement {
    public static void main(String[] args) {

        int mySwitchCase = 2;
        switch (mySwitchCase) {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                System.out.println("Double value was " + 2*mySwitchCase); // You can do mathematical operations
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 4: case 5: case 6: // Merge the three cases
                System.out.println("The value is 4 or 5 or 6");
                break;
            default:
                System.out.println("Please enter the valid value");
                break;
        }
    }
}
