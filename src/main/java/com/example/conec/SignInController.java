package com.example.conec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.ScatterChart;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignInController {

    @FXML
    private Button SignIn;



    @FXML
    private TextField login;


    @FXML
    private Hyperlink reg;

    @FXML
    void goreg(ActionEvent event) {

        reg.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("signup.fxml"));

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
    private PasswordField passwordfield;{

        }

    @FXML
    void signinbutton(ActionEvent event) {

//
        String pass = passwordfield.getText();
        String username = login.getText();
        loginUser(username, pass);

//
////
//
//

////
////


//

    }

    private void loginUser(String username, String pass) {
        DatabaseHandler dbhHandler = new DatabaseHandler() ;
        User user = new User();
        user.setLogin(username);
        user.setPassword(pass);
        ResultSet result = dbhHandler.getUser(user);

        int counter = 0;

       try {
           while (result.next()) {
               counter++;
           }
       } catch (SQLException e){
           e.printStackTrace();
       }

        if (username.equals("")) {

            shake uslerlogin = new shake(login);
            uslerlogin.PlayAnim();
            System.out.println("Login is empty");
            return;

        }

        if (username.length() < 5) {

            shake uslerlogin = new shake(login);
            uslerlogin.PlayAnim();
            System.out.println("Login is too short");
            return;
        }

        if (pass.equals("")) {

            shake passlogin = new shake(passwordfield);
            passlogin.PlayAnim();
            System.out.println("Password is empty");
            return;
        }
        if (pass.length() < 5) {

            shake passlogin = new shake(passwordfield);
            passlogin.PlayAnim();
            System.out.println("Password is too short");
            return;

        }
        if (counter>=1){
            System.out.println("User found!");
            System.out.println("You signed in!");
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
        else {
            System.out.println("User not found!");
            shake passlogin = new shake(passwordfield);
            shake uslerlogin = new shake(login);
            passlogin.PlayAnim();
            uslerlogin.PlayAnim();

        }

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





