import java.util.ArrayList;
import java.util.Scanner;

public class MoonBucksApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();

        // Add drinks
        inventory.add(new Drink("Caramel Latte", 4.99, 250, 30, 8, "Medium"));
        inventory.add(new Drink("Espresso Shot", 2.49, 5, 0, 0, "Small"));
        inventory.add(new Drink("Iced Mocha", 5.49, 320, 40, 10, "Large"));

        // Add gift cards
        inventory.add(new GiftCard("MoonBucks Gift Card", 25.00, "Happy Birthday!", 25.00));
        inventory.add(new GiftCard("MoonBucks Gift Card", 50.00, "Enjoy your coffee!", 50.00));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MoonBucks!");
        System.out.println("Would you like to view all items or just drinks? (all/drinks): ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("all")) {
            for (Product p : inventory) {
                System.out.println(p.toString());
            }
        } else if (choice.equals("drinks")) {
            System.out.println("Would you like to filter by calories, sugar, or fat? (yes/no): ");
            String filterChoice = scanner.nextLine().toLowerCase();

            if (filterChoice.equals("yes")) {
                System.out.print("Filter by (calories/sugar/fat): ");
                String filterType = scanner.nextLine().toLowerCase();

                System.out.print("Enter max value: ");
                int maxValue = scanner.nextInt();

                for (Product p : inventory) {
                    if (p instanceof Drink) {
                        Drink d = (Drink) p;
                        boolean match = switch (filterType) {
                            case "calories" -> d.getCalories() <= maxValue;
                            case "sugar" -> d.getSugar() <= maxValue;
                            case "fat" -> d.getFat() <= maxValue;
                            default -> false;
                        };
                        if (match) {
                            System.out.println(d.toString());
                        }
                    }
                }
            } else {
                for (Product p : inventory) {
                    if (p instanceof Drink) {
                        System.out.println(p.toString());
                    }
                }
            }
        } else {
            System.out.println("Invalid input. Goodbye!");
        }

        scanner.close();
    }
}
