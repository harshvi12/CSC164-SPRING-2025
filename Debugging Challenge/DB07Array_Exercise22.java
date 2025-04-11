/*
Group Member: Harshvi

Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
 */
public class DB07Array_Exercise22 {

    // Bug (Compilation Error): Method 'pairs_value' is declared to return int but doesn't return anything
    static int pairs_value(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements and their sum : ");

        for (int i =  0; i < inputArray.length; i++)
        {
            for (int j  = i + 1; j < inputArray.length; j++)
            {
                // Bug (Logic Error): Condition adds the same element twice — should be inputArray[i] + inputArray[j]
                if (inputArray[i] + inputArray[i] == inputNumber)
                {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
                }
            }
        }

        // Bug (Compilation Error): Missing return statement for method declared with return type 'int'
    }

    public static void main(String[] args)
    {
        pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);

        pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
    }
}
