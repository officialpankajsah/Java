//Q-> Declare a variable n which will store a number for which, we need to print multiplication table.
//    Declare two more variables 'i' and table. i will be our iterator, and table store the calculator output,
//    which we need to print.


import java.util.Scanner;

public class WhileLoopChallenge {
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
