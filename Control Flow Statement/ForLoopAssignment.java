//Q-> A prime number is a number which is divisible by 1 and itself.
//    Print Prime numbers from 1 to n.

import java.util.Scanner;

public class ForLoopAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number : ");
        int n = sc.nextInt();

//        int n = 50;
        for (int i = 1; i <= n; i++) {
            primeNumber(i);
        }

    }

    public static void primeNumber(int n) {
        int count = 0;
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                count++;
            }
        }

        if (count == 0) {
                System.out.println(n + " Is a prime number");
            }
            else {
                System.out.println(n + " Is not a prime number");
            }
    }
}
