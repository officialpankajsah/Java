public class DataTypes {
    public static void main(String[] args) {

// Primitive Data Types
// Java has Eight (8) primitive data types.
// int, long, float, double, boolean, byte and char.

// Int data type :
// Int data type has a maximum value : -2^31 (2147483647)
// Int data type has a minimum value : 2^31-1 (-2147483648)
// Overflow occurs when we assign such a value to a variable which is more than the maximum permissible value.
// Underflow occurs when we assign such a value to a variable which is less than the minimum permissible value.

        int maxRange = Integer.MAX_VALUE;
        int minRange = Integer.MIN_VALUE;
        System.out.println("Int max value : " + maxRange);
        System.out.println("Int min value : " + minRange);

        int sum1 = maxRange + 1;
        int sum2 = minRange - 1;
        System.out.println(sum1); // It will give the value of minRange just because of Overflow.
        System.out.println(sum2); // It will give the value of maxRange just because of Underflow.

// Byte data type :
// Byte data type has a maximum value : 127(Inclusive)
// Byte data type has a maximum value : -128

        byte maxRange1 = Byte.MAX_VALUE;
        byte minRange2 = Byte.MIN_VALUE;
        System.out.println("Byte max value : " + maxRange1);
        System.out.println("Byte min value : " + minRange2);

// Long data type :
// Long data type has a maximum value : 9223372036854775807 after that you have to use - 'l' (92233720368547758071l)
// Long data type has a maximum value : -9223372036854775808

        long maxRange3 = Long.MAX_VALUE;
        long minRange4 = Long.MIN_VALUE;
        System.out.println("Long max value : " + maxRange3);
        System.out.println("Long min value : " + minRange4);

// Short data type :
// Short data type has a maximum value : 32767
// Short data type has a maximum value : -32768

        short maxRange5 = Short.MAX_VALUE;
        short minRange6 = Short.MIN_VALUE;
        System.out.println("Short max value : " + maxRange5);
        System.out.println("Short min value : " + minRange6);


// Casting -> Converting a number from one data type to a different one is called casting in Java.
// Byte data type :

        byte newByteValue = maxRange1;
        System.out.println(newByteValue);
        byte newByteValue1 = (byte) (maxRange1/2); // (byte) and space is use for type casting.
        System.out.println(newByteValue1);

        short newByteValue2 = maxRange5;
        System.out.println(newByteValue2);
        short newByteValue3 = (short) (maxRange5/2); // (short) and space is use for type casting.
        System.out.println(newByteValue3);

// Float data type :
// Float data type has a maximum value : 3.4028235E38 or 3.40282347*10^38
// Float data type has a maximum value : 1.4E-45 or -1.40239846*10^-45

        float maxRange7 = Float.MAX_VALUE;
        float minRange8 = Float.MIN_VALUE;
        System.out.println("Float max value : " + maxRange7);
        System.out.println("Float min value : " + minRange8);

// Double data type :
// Double data type has a maximum value : 1.7976931348623157E308 or 1.7976931348623157*10^308
// Double data type has a maximum value : 4.9E-324 or 4.9406564584124654*10^-324

        double maxRange9 = Double.MAX_VALUE;
        double minRange10 = Double.MIN_VALUE;
        System.out.println("Double max value : " + maxRange9);
        System.out.println("Double min value : " + minRange10);

        int a = 10;
        float b = 10.0f; // most use in coding
        double c = 10.0d;

// Floating point precision :
// Float is less precise than Double.

        int intValue = 22;
        float floatValue = 22f;
        double doubleValue = 22;
        System.out.println("Int value is : " + intValue);
        System.out.println("Float value is : " + floatValue);
        System.out.println("Double value is : " + doubleValue);


        int intValue1 = 22/7;
        float floatValue2 = 22f / 7f;  // Precision
        double doubleValue3 = 22d / 7d; // If you want to Precise value use (d or .0) after number
        System.out.println("Int precision value is : " + intValue1);
        System.out.println("Float precision value is : " + floatValue2);
        System.out.println("Double precision value is : " + doubleValue3);


// Char data type : Primitive data type
// Char represents a single character.
// We define char in java program using single quote ('a').
// Char in Java take 2 bytes (16 bit) storage memory.
        char myChar = 'A';
        System.out.println(myChar);
        char myChar1 = '1';
        System.out.println(myChar1);
        char myChar2 = '2';
//      char newChar = myChar1 + myChar2;  //(Arithmetic & Bitwise operations cannot be performed on char data type.)

//  Go to Google and search Unicode Table for Emoji and Special character.

//        char myUniCode = '\u00AE'; //
//        System.out.println(myUniCode);
//        char myUniCode1 = '\u013F';
//        System.out.println(myUniCode1);

// Boolean data type : True or False

        boolean amIAbove18 = false;

        if(amIAbove18 == true){
            System.out.println("You are eligible for vote");
        }

        if(amIAbove18 == false){
            System.out.println("You are not eligible for vote");
        }

//  Data Types :
//  int - 32 bits or 2 byte
//  byte - 8 bits
//  short - 16 bits or 2 byte
//  long - 64 bits
//  float - 32 bits
//  double - 64 bits
//  char - 16 bits
//  boolean - 1 bit

//  String : Special type of Class. Initialize with capital latter (String)
//  String is a special datatype in Java which is used to define a sequence of characters having a storage width equal to 2.14 billion.
// You cant edit String it will create new one.
        String myName = "My name is Pankaj";
        String myAge = "My age is 25";
        String myPlace = "I am from India";
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myPlace);

        String myInfo = myName + myAge + myPlace;
        System.out.println(myInfo);
        System.out.println(myName + " " + myAge + " " + myPlace);

        myName = myAge + myName; //(Mutability of String) It means delete the first string which you have declare and new String is created.

        int myInt = 100;
        myAge = myAge + myInt;
        System.out.println(myAge);
        String myInt1 = "100";
        String myInt2 = "200";
        int myInt3 = 300;
        double myDouble = 112.334;
        System.out.println(myInt1 + myInt2 + myInt3);




    }
}
