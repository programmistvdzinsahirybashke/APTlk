package com.example.conec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupCon {


    @FXML
    private Hyperlink exists;
    @FXML
    private TextField lognfild;

    @FXML
    private TextField namefild;

    @FXML
    private TextField passfild;

    @FXML
    private Button signupbutton;

    @FXML
    private TextField surnamefild;

    @FXML
    void setname(ActionEvent event) {

    }
    @FXML
    void setlogin(ActionEvent event) {

    }


    @FXML
    void setpass(ActionEvent event) {

    }

    @FXML
    void setsurname(ActionEvent event) {


    }
    @FXML
    void alreyadyexists(ActionEvent event) {
        exists.getScene().getWindow().hide();
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
    void initialize(){


    }
    public void signupbutton(ActionEvent actionEvent) {

//        signupbutton.getScene().getWindow().hide();
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("signin.fxml"));
//
//        try {
//            loader.load();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        Parent root = loader.getRoot();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.show();
//
//        signUpNewUser();
//        System.out.println("You have been registered!");
        signUpNewUser();
    }


    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();


        String name = namefild.getText();
        String surname = surnamefild.getText();
        String login = lognfild.getText();
        String password = passfild.getText();
        User user = new User(name, surname, login, password);

        dbHandler.signUpUser(user);

        if (name.equals("")) {

            shake uslerlogin = new shake(namefild);
            uslerlogin.PlayAnim();
            System.out.println("Name is empty");
            return;

        }

        if (name.length() < 2) {

            shake uslerlogin = new shake(namefild);
            uslerlogin.PlayAnim();
            System.out.println("Name is too short");
            return;
        }
        if (surname.equals("")) {

            shake passlogin = new shake(surnamefild);
            passlogin.PlayAnim();
            System.out.println("Surname is empty");
            return;
        }
        if (surname.length() < 2) {

            shake passlogin = new shake(surnamefild);
            passlogin.PlayAnim();
            System.out.println("Surname is too short");
            return;
        }
        if (login.equals("")) {

            shake passlogin = new shake(lognfild);
            passlogin.PlayAnim();
            System.out.println("Login is empty");
            return;
        }
        if (login.length() < 5) {

            shake passlogin = new shake(lognfild);
            passlogin.PlayAnim();
            System.out.println("Login is too short");
            return;


        }
        if (password.equals("")) {

            shake passlogin = new shake(passfild);
            passlogin.PlayAnim();
            System.out.println("Password is empty");
            return;
        }
        if (password.length() < 5) {

            shake passlogin = new shake(passfild);
            passlogin.PlayAnim();
            System.out.println("Password is too short");
            return;
        }
        else{

                signupbutton.getScene().getWindow().hide();
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

                System.out.println("You have been registered!");

            }

        }


    }



