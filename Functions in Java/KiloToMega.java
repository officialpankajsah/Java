// Q -> Create an integer variable kiloBytes and take an input from the user in kiloBytes.
// Now, create a method named  printMegaBytes(int kiloBytes) and convert the kiloBytes into MegaBytes.
// For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).

import java.util.Scanner;

public class KiloToMega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in kilobyte : ");
        int kiloBytes = sc.nextInt();

        printMegaBytes(kiloBytes);

    }

    public static void printMegaBytes(int kiloBytes){
        int kiloByte, megaByte;
        kiloByte = 1024;
        megaByte = kiloByte / 1024;
        System.out.println("The converted result in megabyte is = " + megaByte);
    }
}
