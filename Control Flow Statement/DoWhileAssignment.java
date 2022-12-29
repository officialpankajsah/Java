//Q-> Declare a variable n and store a number in it. Declare two more variables rem and sum. Your task is to calculate
//    the sum of the digits of the number, rem will be used for storing the digits, and sum will be used to store the
//    sum of those digits.
//
//  For example :
//  N = 12345
//  Sum of digits will be = 15

public class DoWhileAssignment {
    public static void main(String[] args) {
        int n = 12345;
        int rem;
        int sum = 0;

        do {
            rem = n % 10; // 12345 = 5, 1234 = 4, 123 = 3, 12 = 2, 1 = 1.
//            System.out.println(rem);
            sum = rem + sum; // 5+0 = 5, 5+4 = 9, 9+3 = 12, 12+2 = 14, 14+1 = 15.
//            System.out.println(sum);
            n = n/10;  // 12345/10 = 1234, 1234/10 = 123, 123/10 = 12, 12/10 = 1, 1/10 = 0.
//            System.out.println(n);
        }
        while (n != 0);
            System.out.println("The sum of the number is : " + sum);
    }
}
