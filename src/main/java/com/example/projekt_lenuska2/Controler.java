package com.example.projekt_lenuska2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controler {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}