//Q-> Given a positive integer n as an input. Your task is to find the sum of the largest prime factor of each number
//    less than or equal to n.

//    For example:
//    Input : 10
//    Output : 32

//    Explanation:  The sum of the largest prime factors of (2,3,4,5,6,7,8,9,10) is 2+3+2+5+3+7+2+3+5= 32.

import java.util.Scanner;

public class SumOfLargestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int n = sc.nextInt();

        for (int i = 2; i <=n; i++) {
            for (int j = 2; j < i; j++) {

            }
        }
    }
}
