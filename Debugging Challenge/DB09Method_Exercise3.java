/*
Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:

The middle character in the string: 5
 */
import java.util.Scanner;

public class DB09Method_Exercise3 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str) + "\n");
    }

    // Fixed: Changed return type to String and fixed else if condition
    public static String middle(String str)
    {
        int position;
        int length;

        // If the length is even
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 1;
        }
        // If the length is odd
        else
        {
            position = str.length() / 2;
            length = 1;
        }

        return str.substring(position, position + length);
    }
}
