/*
Group Member: Harshvi

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

        // Bug (Logic Error): This only checks if num1 is greater than both but doesn't stop other checks from running
        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);

        // Bug (Logic Error): This says num2 is greatest if it's greater than num1 but less than num3 — which is incorrect
        if (num2 > num1)
            if (num2 < num3)
                System.out.println("The greatest: " + num2);

        // Bug (Logic Error): This checks if num3 is between num1 and num2, not if it's the greatest overall
        if (num3 < num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);
    }
}
