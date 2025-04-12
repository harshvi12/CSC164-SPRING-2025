/*
Group Members: Harshvi

Write a Java program to get a number from the user and print whether it is positive or negative.
 */

import java.util.Scanner;

public class DB01Exercise1 {

    public static void main(String[] args)
    {
        // Bug : 'System' used instead of 'System.in'
        Scanner in = new Scanner(System);

        System.out.print("Input number: ");

        // Bug : 'in.next()' returns a String, but assigned to an int variable
        int input = in.next();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        // Bug : This condition includes zero, so the next condition is unreachable
        else if (input <= 0)
        {
            System.out.println("Number is negative");
        }
        // Bug : 'else if' has no condition, causing a syntax error
        else if
        {
            System.out.println("Number is zero");
        }
    }
}
