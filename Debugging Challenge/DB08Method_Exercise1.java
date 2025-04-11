/*
Group Member: Harshvi

Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25.0
 */

import java.util.Scanner;

public class DB08Method_Exercise1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();

        // Bug (Compilation Error): 'smallest' is a non-static method being called from static context
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

    // Bug (Compilation Error): Method uses 'int' parameters and return type, but input values are 'double'
    public int smallest(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
