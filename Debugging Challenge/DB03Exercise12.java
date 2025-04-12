/*
Write a program in Java to input 5 numbers from keyboard and find their sum and average.
 */
import java.util.Scanner;

public class DB03Exercise12 {

    public static void main(String[] args)
    {
        int i, n = 0, s = 0;
        double avg;

        System.out.println("Input the 5 numbers: ");

        // Fixed: Corrected the loop and sum calculation
        for (i = 0; i < 5; i++)  // Loop should run 5 times, i.e., 0 to 4
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s += n;  // Correct sum calculation
        }

        avg = (double) s / 5;  // Correct average calculation
        System.out.println("The sum of 5 numbers is: " + s + "\nThe Average is: " + avg);
    }
}
