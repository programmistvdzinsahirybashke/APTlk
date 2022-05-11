package com.example.conec;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignIn extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    
        FXMLLoader fxmlLoader = new FXMLLoader(SignIn.class.getResource("signin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("APTlk");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
