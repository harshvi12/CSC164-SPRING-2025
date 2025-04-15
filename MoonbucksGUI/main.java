package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    // List of all products
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        // Create sample product list
        products.add(new Drink("Caramel Latte", 5.25));
        products.add(new Drink("Iced Coffee", 3.75));
        products.add(new GiftCard("Gift Card - $10", 10.00));
        products.add(new GiftCard("Gift Card - $25", 25.00));

        // GUI: ListView to show items
        ListView<String> listView = new ListView<>();
        for (Product product : products) {
            listView.getItems().add(product.toString());
        }

        // Buttons
        Button btnDrinks = new Button("View Drinks");
        Button btnGiftCards = new Button("View Gift Cards");
        Button btnReset = new Button("Reset View");

        // BUTTON FUNCTIONALITY 💡
        btnDrinks.setOnAction(e -> {
            listView.getItems().clear();
            for (Product p : products) {
                if (p instanceof Drink) {
                    listView.getItems().add(p.toString());
                }
            }
        });

        btnGiftCards.setOnAction(e -> {
            listView.getItems().clear();
            for (Product p : products) {
                if (p instanceof GiftCard) {
                    listView.getItems().add(p.toString());
                }
            }
        });

        btnReset.setOnAction(e -> {
            listView.getItems().clear();
            for (Product p : products) {
                listView.getItems().add(p.toString());
            }
        });

        // Layout setup
        HBox buttonBox = new HBox(10, btnDrinks, btnGiftCards, btnReset);
        VBox root = new VBox(10, listView, buttonBox);

        // Scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Moonbucks Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
