//Q-> Declare a Char Variable and initialise it any Letter of the English alphabet.
// Determine whether the input is a Vowel or not. Do this using Switch statement.
public class SwitchChallenge {
    public static void main(String[] args) {
        char letter = 'b';
        switch (Character.toUpperCase(letter)) { //converting the character into upper case (Character.toUpperCase())
                                                 //converting the character into lower case (Character.toLowerCase())
            case 'A':
                System.out.println("It is a Vowel");
                break;
            case 'E':
                System.out.println("It is a Vowel");
                break;
            case 'I':
                System.out.println("It is a Vowel");
                break;
            case 'O':
                System.out.println("It is a Vowel");
                break;
            case 'U':
                System.out.println("It is a Vowel");
                break;
            default:
                System.out.println("It is a consonant");
        }
    }
}
