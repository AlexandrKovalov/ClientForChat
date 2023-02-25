package com.example.client;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    public void sendMessage(ActionEvent actionEvent) {
        String message = textField.getText();
        textField.clear();
        textArea.appendText(message + "\n");
        textField.requestFocus();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            textField.requestFocus();
        });
    }
}