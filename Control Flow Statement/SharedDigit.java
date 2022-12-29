//Q-> Write a method named hasSharedDigit with two parameters of type int.
//   Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the
//   range, the method should return false.
//   The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise,
//   the method should return false.

//   EXAMPLE INPUT/OUTPUT:
//   hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//   hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//   hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Number is between 10 & 99 : " + hasSharedDigit(num1,num2));

    }

    public static boolean hasSharedDigit(int num1, int num2) {

        int leftA = num1 / 10;
        int rightA = num1 % 10;
        int leftB = num2 / 10;
        int rightB = num2 % 10;
        if (leftA == leftB || leftA == rightA || rightA == leftB || rightA == rightB) {
            return true;
        }
        else
            return false;
    }
}
