/*
Write a Java program to test if an array contains a specific value.
 */
public class DB04Array_Exercise5 {

    // Fixed: Changed return type to boolean
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Fixed: Corrected array initialization
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        // Fixed: Calling the static method correctly
        System.out.println(contains(my_array1, 2013));  // Output: true
        System.out.println(contains(my_array1, 2015));  // Output: false
    }
}
