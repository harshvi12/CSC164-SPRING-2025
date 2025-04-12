/*
Name: Harshvi
Write a Java program to get a number from the user and print whether it is positive or negative.
 */

import java.util.Scanner;

public class DB01Exercise1 {

    public static void main(String[] args)
    {
        // Fixed: Changed 'System' to 'System.in'
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");

        // Fixed: Changed 'in.next()' to 'in.nextInt()' to capture integer input
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        // Fixed: Changed condition to check for negative numbers
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        // Fixed: Used 'else' instead of 'else if' for zero
        else
        {
            System.out.println("Number is zero");
        }
    }
}
