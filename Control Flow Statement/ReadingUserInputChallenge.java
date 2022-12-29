// Q-> Ask for a number from the user for which he wants to print a table. The message should be "Please enter the
//     number for which you want to print the table".
//     Store that number in a variable n, create a method printTheTable, for calculating and printing the table for n.
//     Use Scanner method for accepting the input from user.

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for which you want to print the table : ");
        int number = sc.nextInt();

        printTheTable(number);

    }

    public static void printTheTable(int number) {
        int table;
        for (int i = 1; i <= 10; i++) {
            table = number * i;
            System.out.println(number + " * " + i + " = " + table);
        }
    }

}
