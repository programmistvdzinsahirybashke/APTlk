package com.example.conec;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class SignIn extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.getIcons().add(new Image("https://sun9-86.userapi.com/s/v1/ig2/7GKN-Jd4vmLne_zBe5lPcFwx-VqobCLlLgbejrX2WqXjtNge17plfjL-vUBwLnwCt1Ez5o54XIpgNcy4vINXFb8N.jpg?size=1920x1920&quality=95&type=album"));
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
