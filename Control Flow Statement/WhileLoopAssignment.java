//Q-> Declare a variable n which will store the digit, whose table we need to print. Declare two more variables i and
//    table. 'i' will be our iterator, and table will store the calculated output. Which we need to print.

import java.util.Scanner;

public class WhileLoopAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter which table you want : ");
        int n = sc.nextInt();
        int i = 1;
        int table;

        while (i <= 10) {
            table = n * i;
            System.out.println(n + " * " + i + " = " + table);
            i++;
        }

    }
}
