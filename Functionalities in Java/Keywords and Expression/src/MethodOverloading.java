//Method Overloading : If a class has multiple methods having same name but different in parameters.
//Advantage of method overloading :
// * Method overloading increases the readability of the program.
// * Different ways to overload the method.
// There are two ways to overload the method in java :
// By changing number of arguments & data type.

// Method Overloading is the phenomenon of having multiple methods with the same method_name() but different arguments.
// The difference between the arguments can either be the number of arguments or the datatype of arguments.
// Method overloading helps us to remember various methods as they have the same method name, and we can call them depending upon our requirements.
// It improves the code re-usability and readability.


public class MethodOverloading {

    public static void main(String[] args) {
        String name = "Pankaj";
        int age = 25;
        char grade = 'A';
        double height = 168.5;

        userDetails(name, age, grade, height);
        userDetails(name, age, grade);
        userDetails(name, age);
        userDetails(name, grade);
        userDetails(name);
        userDetails();

    }

    public static void userDetails(String name, int age, char grade, double height) {
        System.out.println("My name is " + name + ", my age is " + age + " and I score " + grade + " grade and my height is " + height);
    }

    public static void userDetails(String name, int age, char grade) {
        System.out.println("My name is " + name + ", my age is " + age + " and I score " + grade + " grade");
    }

    public static void userDetails(String name, int age) {
        System.out.println("My name is " + name + ", my age is " + age);
    }

    public static void userDetails(String name, char grade) {
        System.out.println("My name is " + name + ", I score grade " + grade);
    }
    public static void userDetails(String name) {
        System.out.println("My name is " + name);
    }

    public static void userDetails() {
        System.out.println("I want to become Software Engineer");
    }

}
