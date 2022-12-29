//Q-> Write a method called numberToWords with one int parameter named number.

//    The method should print out the passed number using words for the digits.

//    If the number is negative, print “Invalid Value”.

//    Example Input/Output :
//    numberToWords(123)-> should print “One Two Three”.
//    numberToWords(3456)-> should print “Three Four Five Six”.
//    numberToWords(-7)-> should print “Invalid Value” since parameter is negative;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = sc.nextInt();

    }

    public static void numberToWords(int number) {
         if (number < 0) {
             System.out.println("Invalid Value");
         }

    }

}
