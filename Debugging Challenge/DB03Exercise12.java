/*
Group Member: Harshvi

Write a program in Java to input 5 numbers from keyboard and find their sum and average.
 */
import java.util.Scanner;
public class DB03Exercise12 {

    public static void main(String[] args)

    {
        int i, n = 0, s = 0;
        double avg;
        {
            System.out.println("Input the 5 numbers : ");
        }

        // Bug (Compilation Error): 'i+’ is not valid syntax — should be 'i++' for increment
        for (i = 0; i <= 5; i+)
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            // Bug (Logic Error): 's += n + s;' keeps adding 's' again and again — this causes wrong total
            s += n + s;
        }

        // Bug (Logic Error): Since loop runs 6 times (i = 0 to 5), it's not really averaging 5 numbers
        avg = s / 5;

        System.out.println("The sum of 5 no is : " + s + "\nThe Average is : " + avg);
    }
}
