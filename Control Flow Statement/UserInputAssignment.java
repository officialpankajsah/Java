//Q=> Ask for a number from the user for which he wants to print a table for. The message should be “Please enter the
//    number for which you want to print the table” . Store that number in a variable n, create a method
//    printTheTable, for calculating and printing the table for n. Use Scanner method for accepting the input
//    from the user.

import java.util.Scanner;

public class UserInputAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for which you want dto print the table : ");
        int n = sc.nextInt();

        printTable(n);
    }

    public static void printTable(int n) {
        int sum;
        for (int i = 1; i <= 10; i++) {
            sum = n * i;
            System.out.println(n + " * " + i + " = " + sum);
        }
    }
}
