package com.example.conec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javax.swing.*;
import java.io.IOException;

import static jdk.internal.joptsimple.internal.Strings.isNullOrEmpty;

public class SignInController {

    @FXML
    private Button SignIn;



    @FXML
    private TextField login;






    @FXML
    private PasswordField passwordfield;{

        }

    @FXML
    void signinbutton(ActionEvent event) {


        String username = login.getText();
        if (username.equals("")){
            shake uslerlogin = new shake(login);
            uslerlogin.PlayAnim();
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//
//            alert.setTitle("Warning!");
//            alert.setHeaderText(null);
//            alert.setContentText("Login is empty!");
//
//            alert.show();

            System.out.println("Login is empty");
            return;
        }
        if (username.length()<5) {
            shake uslerlogin = new shake(login);
            uslerlogin.PlayAnim();
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//
//            alert.setTitle("Warning!");
//            alert.setHeaderText(null);
//            alert.setContentText("Login is too short!");
//
//            alert.show();
            System.out.println("Login is too short");
            return;
        }
        String pass = passwordfield.getText();
        if (pass.equals("")){
            shake passlogin = new shake(passwordfield);
            passlogin.PlayAnim();
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//
//            alert.setTitle("Warning!");
//            alert.setHeaderText(null);
//            alert.setContentText("Password is empty!");
//
//            alert.show();
            System.out.println("Password is empty");
            return;
        }
        if (pass.length()<5 ){
            shake passlogin = new shake(passwordfield);
            passlogin.PlayAnim();
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//
//            alert.setTitle("Warning!");
//            alert.setHeaderText(null);
//            alert.setContentText("Password is too short!");
//
//            alert.show();
            System.out.println("Password is too short");
            return;
        }

        System.out.println("You signed in");
        SignIn.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("lk.fxml"));

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
    void passfield(ActionEvent event) {

    }
    @FXML
    void loginfield(ActionEvent event) {

    }

    @FXML
    public void initialize() {



    }



}





