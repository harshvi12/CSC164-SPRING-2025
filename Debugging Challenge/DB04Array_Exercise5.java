/*
Group Member: Harshvi

Write a Java program to test if an array contains a specific value.
 */
public class DB04Array_Exercise5 {

    // Bug (Compilation Error): Method 'contains' returns boolean, not int — mismatch with method declaration
    public int contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Bug (Compilation Error): Array declaration is incorrect — missing square brackets []
        int my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        // Bug (Compilation Error): 'contains' is not static, but called from static 'main' — leads to error
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
    }
}
