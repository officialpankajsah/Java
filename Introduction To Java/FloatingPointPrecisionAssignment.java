public class FloatingPointPrecisionAssignment {
    public static void main(String[] args) {

//Calculate the quantity of petrol and diesel in a budget of INR 1546.12 according to respective prices 84.11, 74.91.

        float petrolQuantity, dieselQuantity;
        double petrolQuantity1, dieselQuantity1;

        float petrolPrice = 84.11f;
        float dieselPrice = 74.91f;
        float walletBalance = 1546.12f;
        petrolQuantity = walletBalance / petrolPrice;
        dieselQuantity = walletBalance / dieselPrice;

        double petrolPrice1 = 84.11;
        double dieselPrice1 = 74.91;
        double walletBalance1 = 1546.12;
        petrolQuantity1 = walletBalance1 / petrolPrice1;
        dieselQuantity1 = walletBalance1 / dieselPrice1;

        System.out.println ("The quantity of petrol that we can buy INR " +walletBalance + " is " + petrolQuantity + " Ltr.");
        System.out.println ("The quantity of diesel that we can buy INR " +walletBalance + " is " + dieselQuantity + " Ltr.");
        System.out.println ("The quantity of petrol that we can buy INR " +walletBalance1 + " is " + petrolQuantity1 + " Ltr.");
        System.out.println("The quantity of diesel that we can buy INR " + walletBalance1 + " is " + dieselQuantity1 + " Ltr.");

    }
}
