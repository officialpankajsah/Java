import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month : ");
        String month = sc.nextLine();
        System.out.println("Please enter the year : ");
        int year = sc.nextInt();
        int days = 1;

        if (days == 0 || year == 0){
            System.out.println("Invalid Day");
        }

        switch (days) {
            case 1:
                System.out.println("January " + year + " has 31 Days");
                break;
            case 2:
                System.out.println("February " + year + " has 29 Days");
                break;
            case 3:
                System.out.println("March " + year + " has 31 Days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 Days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 Days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 Days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 Days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 Days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 Days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 Days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 Days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 Days");
                break;
        }
    }
}
