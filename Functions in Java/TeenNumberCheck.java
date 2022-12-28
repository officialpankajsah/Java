// Q-> Write a method named hasNotTeen with 3 parameters of type int.
//     We’ll say that a number is “teen” if it is in the range 13.19 inclusive, otherwise it is not teen.
//     Given 3 int values, return true if none of them are teen, otherwise return false.

//     Example
//     Sample Input 1 : 13 12 20
//     Sample Output 1: False
//     Explanation: Since 13 is a teen number, hence false is returned.

//     Sample Input 2: 9 29 21
//     Sample output 2: True
//     Explanation: Since numbers 9,29,21 are not in range 13-19, hence true is returned.

import java.util.Scanner;

public class TeenNumberCheck {
    public static boolean hasNotTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19){
            return false;
        }
        else if (num2 >= 13 && num2 <= 19){
            return false;
        }
        else if (num3 >= 13 && num3 <= 19){
            return false;
        }
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        boolean res = hasNotTeen(num1,num2,num3);
        System.out.println(res);
    }
}
