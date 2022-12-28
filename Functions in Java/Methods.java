public class Methods {


// Method : A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation.
// Methods are used to achieve the usability of code.
// Methods also provides the easy modification and readability of code.
// void means you don't want to return anything.

    public static void main(String[] args) {  // main method

        myDetails();  // Calling the method from myDetails()
        System.out.println("This is test detail"); // Calling the method from myDetails()
        myDetails(); // Calling the method from myDetails()

        perimeterOfRect(10, 20); // Calling the method from perimeterOfRect()
        perimeterOfRect(35, 40); // Calling the method from perimeterOfRect()

        speedOfObject(40, 56); // Calling the method from speedOfObject()

        double topSpeed = speedOfObject1(100, 20); // topSpeed = 5. Calling the method from speedOfObject1()
//        double topSpeed = speedOfObject1(200, 20);
        double x = 40 * topSpeed; // Calling the method from speedOfObject1()
        System.out.println(x);
    }

    public static void myDetails() {  // creating new method and use in (main method) many times as you want.
        String myName = "Pankaj Kumar Sah";
        int myAge = 25;
        double myHeight = 5.7;
        System.out.println("My name is " + myName);
        System.out.println("My age is : " + myAge);
        System.out.println("My height is : " + myHeight);

    }

    public static void perimeterOfRect(int length, int breadth){ // creating new method and use in (main method) many times as you want.
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter is : " + perimeter);
    }

    public static void speedOfObject(double distance, double time){
        double speed = distance / time;
        System.out.println("Speed is : " + speed);
    }

    public static double speedOfObject1(double distance, double time) { // It will return the value
//        if (distance == 100) {
            double speed = distance / time;
            return speed; // It will return to the main method
//        }
//        else {
//            return 0;
//        }
    }
}
