package com.example.projekt_lenuska2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("uvodna.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 350);

        stage.setTitle("AHOJ!");
        //Image image=new Image("heart-png.webp");
        //stage.getIcons().add(image);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}