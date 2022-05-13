package com.example.conec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.awt.*;


public class lkController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button moodle;
    @FXML
    private Button logout;

    @FXML
    private Button messages;
    @FXML
    private Button profile;
    @FXML
    private Button portfolio;
    @FXML
    private Button sttngs;
    @FXML
    private Button rates;

    @FXML
    void openprofiles(ActionEvent event) {
        System.out.println("Now see your profile!");
        profile.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("profile.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();

    }
    @FXML
    void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Выход из аккунта");
        alert.setHeaderText("Вы действительно хотите выйти из аккаунта?");
        alert.setContentText("Нажмите ОК для выхода или Cancel для отмены ");

        Optional<ButtonType> option = alert.showAndWait();

        if (option.get() == null  || option.get() == ButtonType.CANCEL) {
            return;
        } else if (option.get() == ButtonType.OK) {
            // запускаешь
        }
        System.out.println("You signed out");
        logout.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("signin.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();


    }
    @FXML
    void opensettings(ActionEvent event) throws URISyntaxException, IOException {
        System.out.println("Now you can change your settings!");
        Desktop.getDesktop().browse(new URI("https://almetpt.ru/2020/site/personal"));



    }
    @FXML
    void openmymessages(ActionEvent event) throws URISyntaxException, IOException {
        System.out.println("Now see your lessons!");
        Desktop.getDesktop().browse(new URI("https://almetpt.ru/2020/site/schedule/group/"));



    }

    @FXML
    void openmoodle(ActionEvent event) throws URISyntaxException, IOException {
        System.out.println("Now do your tasks!");
        Desktop.getDesktop().browse(new URI("https://almetpt.ru/moodle/"));

    }
    @FXML
    void openmyportfolio(ActionEvent event) throws URISyntaxException, IOException{
        System.out.println("Now see your portfolio!");
        Desktop.getDesktop().browse(new URI("https://almetpt.ru/2020/site/html/studentpf"));


    }

    @FXML
    void openmyrates(ActionEvent event) throws URISyntaxException, IOException {
        System.out.println("Now check your rates!");
        Desktop.getDesktop().browse(new URI("https://almetpt.ru/students/magazine"));

    }


    @FXML
    void initialize() {


    }

}