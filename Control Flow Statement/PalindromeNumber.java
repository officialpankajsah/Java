//Q-> Create a function isPalindrome with one int parameter number and Check if the number is palindrome number or not.
//    If it is palindrome return true, otherwise return false.

//    For example ,
//    isPalindrome(121)-> should return true
//    isPalindrome(12343)-> should return false because the reverse is 34321, and it is not equal to 12343.

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = sc.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is a palindrome number");
        else
            System.out.println(number + " is not a palindrome number");

    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        if (number == reverse) {
            return true;
        }
        else
            return false;

    }
}
