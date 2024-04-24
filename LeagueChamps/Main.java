package com.example.leaguechamps;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Escolha seu campeão:");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

