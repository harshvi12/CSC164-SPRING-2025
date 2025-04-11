/*
Group Member: Harshvi

Write a Java method to display the middle character of a string.
Note:
a) If the length of the string is odd there will be two middle characters.
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

        // Bug (Compilation Error): Method 'middle' returns a string, but declared as char — type mismatch
        System.out.print("The middle character in the string: " + middle(str) + "\n");
    }

    // Bug (Compilation Error): Return type is 'char', but 'substring()' returns a String — incompatible types
    public static char middle(String str)
    {
        int position;
        int length;

        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }

        // Bug (Syntax Error): 'else if' used without a condition — leads to compilation error
        else if
        {
            position = str.length() / 2 + 1;
            length = 1;
        }

        // Bug (Compilation Error): Returning a String while the method is expected to return a char
        return str.substring(position, position + length);
    }
}
