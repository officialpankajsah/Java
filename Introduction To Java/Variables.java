public class Variables {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;
        System.out.println("firstNumber"); //Use of String Literal -> ""
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        int firstNumber1 = 25; //variable (firstName) is already declared that's why it is not possible to declare same variable. Change the variable name.
        System.out.println(firstNumber1);

// Variables -> While defining Variables we need to be specific about the data types, give a variable name.
// We can also write an expression to initialise the variable with a value.
// Declaration -> A statement is needed to declare the variable by specifying its data type, the variable name, and also set it to some initial value.
// String Literal -> Any set of characters when surrounded by double inverted commas, is called a String Literal.
// Its value is fixed and cannot be changed.
// Operators -> Just like we have operators in Maths, Java also have operators like +,-,*,/,% and many more to do basic operations.

// Q-> Declare two variables of your choice by assigning them some initial values.
// Post that, write statements to print the values of the variables.
// A->
        int value1 = 10;
        int value2 = (20 + 8) + (6 * 2);
        int sum = value1 + value2;
        System.out.println(sum);

// Q-> Declare 3 variable of type int with initial values. Add all of them and print out the sum.
// A->
        int first = 23;
        int second = 22;
        int third = 15;
        int sumOfThree = first + second + third;
        System.out.println("The sum of three number is : " + sumOfThree);


    }
}
