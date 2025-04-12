/*
Write a Java program to insert an element (specific position) into an array.
 */
import java.util.Arrays;

public class DB05Array_Exercise9 {

    public static void main(String[] args) {

        // Fixed: Corrected array initialization
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 2;
        int newValue = 5;

        // Fixed: Create a new array with extra space
        int[] new_array = new int[my_array.length + 1];

        // Copy elements before the insertion position
        System.arraycopy(my_array, 0, new_array, 0, Index_position);

        // Insert the new element
        new_array[Index_position] = newValue;

        // Copy remaining elements after the insertion position
        System.arraycopy(my_array, Index_position, new_array, Index_position + 1, my_array.length - Index_position);

        // Output the original and the new array
        System.out.println("Original Array : " + Arrays.toString(my_array));
        System.out.println("New Array: " + Arrays.toString(new_array));
    }
}
