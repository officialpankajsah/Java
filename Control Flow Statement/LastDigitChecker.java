//Q-> Write a method named hasSameLastDigit with three parameters of type int.

//    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within
//    the range, the method should return false.

//    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should
//    return false.

//    EXAMPLE INPUT/OUTPUT:
//    hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//    hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//    hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

import java.util.Scanner;

public class LastDigitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Please enter the third number : ");
        int num3 = sc.nextInt();

        System.out.println("Has same last digit : " + hasSameLastDigit(num1,num2,num3));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 >= 10 && num1 <=100) && (num2 >= 10 && num2 <=100) && (num3 >= 10 && num3 <=100)) {
            return ((num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10));
        }
        return false;
    }
}
