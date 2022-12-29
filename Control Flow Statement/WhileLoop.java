// Java while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean
// condition. the while loop can be thought of as a repeating if statement. If the condition evaluates to true then we
// will execute the body of the loop and go to update expression.

public class WhileLoop {
    public static void main(String[] args) {
//        int count = 1;
//
//        while (count != 10){  // First method - Using while loop.
//            System.out.println("The count is : " + count);
//            count++;
//        }
//
//        for (count = 1; count < 10; count++) { // Using For Loop
//            System.out.println("The count is : " + count);
//        }
//
//        while (true) {  // Second method - Using while loop.
//            if (count == 6) {
//                break;
//            }
//            System.out.println("The count is :" + count);
//        }
//
//        do{  // First method - Using do-while loop. (Same as Second method of while loop only the Syntax is change)
//            System.out.println("The count is :" + count);
//            count++;
//        }
//        while (count != 6);

        // Write a method to predict an odd number, if odd return true, else return false.
        // In the main using a while loop print all the odd number from 5 to 30.


//        boolean check = oddNumber(3);
//        System.out.println(check);

        int minValue = 5;
        int maxValue = 30;

        while (minValue <= maxValue) {
            minValue++;
            if (! oddNumber(minValue)) {
                continue;
            }
            System.out.println("The odd number is : " + minValue);
        }
    }

    public static boolean oddNumber(int num) {
        if (num%2 == 1) {
            return true;
        }
        else
            return false;
    }

}
