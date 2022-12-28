// Q -> Write a program to accept three number and check whether they are pythagorean triplet or not.

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length : ");
        int length = sc.nextInt();
        System.out.print("Please enter breadth : ");
        int breadth = sc.nextInt();
        System.out.print("Please enter hypotenuse : ");
        int hypotenuse = sc.nextInt();

        calculatePythagorean(length,breadth,hypotenuse); // calling the function
    }

    public static void calculatePythagorean(int length, int breadth, int hypotenuse) {
        int p = length * length;
        int q = breadth * breadth;
        int r = hypotenuse * hypotenuse;

        if ((p + q) == r) {
            System.out.println(length + "," + breadth + " and " + hypotenuse + " are Pythagorean Triplets");
        }
        else {
            System.out.println(length + "," + breadth + " and " + hypotenuse + " are not Pythagorean Triplets");
        }
    }
}
