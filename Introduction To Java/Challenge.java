public class Challenge {
    public static void main(String[] args) {

// Declare three Variables and initialise them with some valid values. One of type int, one of type byte and one of type short.
// Finally, create a variable of type long which is equal to 1000 times the sum of the above three.

        int value1 = 10;
        byte value2 = 15;
        short value3 = 5;

        long longSum = 1000 * (value1 + value2 + value3);
        System.out.println(longSum);

        short shortSum = (short) (1000 * (value1 + value2 + value3)); // Casting just because of Providing Int but required short.
        System.out.println(shortSum);

        byte byteSum = (byte) (1000 * (value1 + value2 + value3)); // Casting just because of Providing Int but required short.
        System.out.println(byteSum);

        int intSum = (int) (1000 * (value1 + value2 + value3)); // Casting just because of Providing Int but required short.
        System.out.println(intSum);



    }
}
