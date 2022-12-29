//Q-> Write a method named getOddDigitSum with one parameter of type int called number.
//    The method should return the sum of the odd digits within the number.
//    If the number is negative, the method should return -1 to indicate an invalid value.

//    EXAMPLE INPUT/OUTPUT:
//    getOddDigitSum(123456789); → should return 25 since 1 + 3 + 5 + 7 +9 = 25
//    getEvenDigitSum(252); → should return 5 since 5 is the only odd digit in the number
//    getEvenDigitSum(-22); → should return -1 since the number is negative.

import java.util.Scanner;

public class OddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = sc.nextInt();

        System.out.println("The sum of Odd number is : " + getOddDigitSum(number));

    }

//    public static int getOddDigitSum(int number) {
//        int sum = 0, digit;
//
////        For negative
//        if (number < 0)
//            return -1;
//
////      For Odd
//        while (number > 0) {
//            digit = number % 10; // Last Digit
//            if (digit % 2 == 1) {  // Odd
//                sum = sum + digit; // Sum
//            }
//            number = number / 10;
//        }
//        return sum;
//    }

    public static int getOddDigitSum(int number) {
        int sum = 0, lastDigit;

//        For negative
        if (number < 0)
            return -1;

//        For Odd
        while (number > 0) {
            lastDigit = number % 10; // Last Digit
            if (lastDigit % 2 == 1) {  // Odd Digit
                sum = sum + lastDigit;  // Sum
            }
            number = number / 10;  // Check the number if it is odd or not
        }
        return sum;
    }

}
