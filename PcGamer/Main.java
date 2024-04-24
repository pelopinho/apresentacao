package com.example.pcgamer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setTitle("Monte seu PC Gamer");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

