package com.client_email;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent parent = FXMLLoader.load(getClass().getResource("../../../resources/LoginWindow.fxml"));

        Scene scene = new Scene(parent, 600, 220);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}