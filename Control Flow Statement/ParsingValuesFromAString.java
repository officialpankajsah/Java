// Parsing : It will convert String type to Integer and Double Using Double.parseDouble(myStringValue) and
//           Integer.parseInt(myStringValue)

public class ParsingValuesFromAString {

    public static void main(String[] args) {
        String myStringValue = "2500.215";
        double myDoubleValue = Double.parseDouble(myStringValue);  // Double.parseDouble it is use for converting
                                                                   // the String into Double variable.
        System.out.println(myStringValue);

        myStringValue = myStringValue + 1;
        myDoubleValue += 1;
        System.out.println(myStringValue);
        System.out.println(myDoubleValue);

//        int myIntValue = Integer.parseInt(myStringValue);  // Integer.parseInt it is use for converting the
//                                                           // String into Integer variable.
//        System.out.println(myIntValue);
//
//        myIntValue = myIntValue + 1;
//        System.out.println("New value : " + myIntValue);

    }
}
