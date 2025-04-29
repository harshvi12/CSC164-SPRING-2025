import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Create Inventory
        ArrayList<Product> inventory = new ArrayList<>();

        // Add some Drinks
        inventory.add(new Drink("Latte", 4.50, 150, 12, 5, "Medium"));
        inventory.add(new Drink("Cappuccino", 4.00, 120, 10, 4, "Small"));
        inventory.add(new Drink("Iced Coffee", 3.00, 80, 5, 1, "Large"));

        // Add some GiftCards
        inventory.add(new GiftCard("Holiday Gift Card", 25.00, "Happy Holidays!", 25.00));
        inventory.add(new GiftCard("Birthday Gift Card", 50.00, "Happy Birthday!", 50.00));

        // Menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Moonbucks! What would you like to view?");
        System.out.println("1. View All Items");
        System.out.println("2. View Only Drinks");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        if (choice == 1) {
            // View All
            System.out.println("\n--- All Items ---");
            for (Product p : inventory) {
                System.out.println(p.toString());
            }
        } else if (choice == 2) {
            // View Drinks
            System.out.println("\nFilter drinks by:");
            System.out.println("1. Calories");
            System.out.println("2. Sugar");
            System.out.println("3. Fat");
            int filterChoice = scanner.nextInt();

            System.out.println("\n--- Drinks ---");
            for (Product p : inventory) {
                if (p instanceof Drink) {
                    Drink d = (Drink) p;

                    boolean show = false;
                    if (filterChoice == 1 && d.getCalories() <= 150) {
                        show = true;
                    } else if (filterChoice == 2 && d.getSugar() <= 10) {
                        show = true;
                    } else if (filterChoice == 3 && d.getFat() <= 5) {
                        show = true;
                    }

                    if (show) {
                        System.out.println(d.toString());
                    }
                }
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
