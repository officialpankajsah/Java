//Q-> Declare a variable n and store a number in it.
// Declare two more variable rem and sum. Your task is to calculate the sum of the digits of the number.
// 'Rem' will be used for storing the digits and 'sum' will be used to store the sum of those digits,
// For example, N = 12345 Sum of digits will be = 15.

import java.util.Scanner;

public class DoWhileChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int n = sc.nextInt();
        int rem;
        int sum = 0;

        do {
            rem = n % 10;      // If n is 12345 then the reminder is 5, 1234 = 4 is reminder, 123 = 3, 12 = 1
//            System.out.println(rem);
            sum = rem + sum;   // 5+0 = 5, 5+4 = 9, 9+3 = 12, 12+2 = 14, 14+1 = 14
//            System.out.println(sum);
            n = n / 10;        // 12345/10 = 1234, 1234/10 = 123, 123/10= 12, 12/10 = 1
//            System.out.println(n);

        }
        while (n != 0);
            System.out.println("The sum of the digit is = " + sum);
    }
}
