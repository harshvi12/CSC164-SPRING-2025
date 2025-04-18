/*
Take three numbers from the user and print the greatest number.
 */
import java.util.Scanner;

public class DB02Exercise3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        // Fixed: Simplified conditions for finding the greatest number
        if (num1 >= num2 && num1 >= num3)
            System.out.println("The greatest: " + num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println("The greatest: " + num2);
        else
            System.out.println("The greatest: " + num3);
    }
}
