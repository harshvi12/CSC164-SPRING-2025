/*
Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Expected Output:
1. A password must have at least ten characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
Password is valid: abcd1234
 */
import java.util.Scanner;

public class DB10Method_Exercise11 {

    // Fixed: Updated to require a password of at least 10 characters
    public static final int PASSWORD_LENGTH = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least ten characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least two digits \n" +
                        "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        // Fixed: Corrected method call with 's' as argument
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }
    }

    public static boolean is_Valid_Password(String password) {

        // Fixed: Return false if password length is less than required
        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false; // Fixed: Return false if non-letter and non-digit characters are found
        }

        // Fixed: Return true only if there are at least two digits
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
}
