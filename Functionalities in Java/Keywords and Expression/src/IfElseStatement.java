public class IfElseStatement {
    public static void main(String[] args) {

// Control flow statement : If, Else
// The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.

// Syntax for if-else statement :

//    if(condition) {
//        // code
//    }
//    else{
//        //code
//    }

// 100 - S
// 91 to 99 - A
// 81 to 90 - B
// anything below you failed

    int studentScore = 100;

    if (studentScore >= 100) {
        System.out.println("You scored S grade");
    }
        else if (studentScore > 90 && studentScore < 100) {
            System.out.println("You scored A grade");
        }
        else if (studentScore > 80 && studentScore < 91) {
            System.out.println("You scored B grade");
        }
        else {
            System.out.println("You failed");
        }


    }
}

