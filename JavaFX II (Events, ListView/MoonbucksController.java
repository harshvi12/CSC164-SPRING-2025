import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MoonbucksController {
    @FXML private ListView<String> productListView;
    @FXML private Label totalLabel;

    private ObservableList<Product> inventory = FXCollections.observableArrayList();

    public void initialize() {
        // Load data
        inventory.addAll(
                new Drink("Latte", 3.99, 200, 20, 5, "Medium"),
                new Drink("Iced Coffee", 2.99, 120, 15, 2, "Large"),
                new GiftCard("Gift Card A", 25.0, "Happy B-Day!", 25.0),
                new Mug("Classic Mug", 12.99, "White", true)
        );
    }

    public void showAllProducts() {
        ObservableList<String> displayList = FXCollections.observableArrayList();
        double total = 0;

        for (Product p : inventory) {
            displayList.add(p.toString());
            total += p.getPrice();
        }

        productListView.setItems(displayList);
        totalLabel.setText("Total (w/ tax): $" + String.format("%.2f", total * 1.06));
    }

    public void showOnlyDrinks() {
        ObservableList<String> displayList = FXCollections.observableArrayList();
        double total = 0;

        for (Product p : inventory) {
            if (p instanceof Drink) {
                displayList.add(p.toString());
                total += p.getPrice();
            }
        }

        productListView.setItems(displayList);
        totalLabel.setText("Total (w/ tax): $" + String.format("%.2f", total * 1.06));
    }

    public void showOnlyGiftCards() {
        ObservableList<String> displayList = FXCollections.observableArrayList();
        double total = 0;

        for (Product p : inventory) {
            if (p instanceof GiftCard) {
                displayList.add(p.toString());
                total += p.getPrice();
            }
        }

        productListView.setItems(displayList);
        totalLabel.setText("Total (w/ tax): $" + String.format("%.2f", total * 1.06));
    }
}
