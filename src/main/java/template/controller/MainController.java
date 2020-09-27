package template.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField textField;
    
    @FXML
    public void onClickButton() {
        final String text = textField.getText();
        final Alert alert = new Alert(Alert.AlertType.INFORMATION, text);
        alert.showAndWait();
    }
}
