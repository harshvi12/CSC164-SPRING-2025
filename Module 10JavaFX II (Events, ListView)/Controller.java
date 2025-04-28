package yourpackage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<String> myListView;

    @FXML
    private Label selectedLabel;

    @FXML
    private Button addButton;

    @FXML
    private Button clearButton;

    private ObservableList<String> items;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        items = FXCollections.observableArrayList(
                "Apple", "Banana", "Cherry", "Date", "Elderberry"
        );
        myListView.setItems(items);

        // Enable multiple selection
        myListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // Update label when selection changes
        myListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            ObservableList<String> selectedItems = myListView.getSelectionModel().getSelectedItems();
            selectedLabel.setText("Selected: " + String.join(", ", selectedItems));
        });

        // Add new item on button click
        addButton.setOnAction(event -> {
            items.add("New Item");
        });

        // Clear all items on button click
        clearButton.setOnAction(event -> {
            items.clear();
            selectedLabel.setText("Selected:");
        });
    }
}
