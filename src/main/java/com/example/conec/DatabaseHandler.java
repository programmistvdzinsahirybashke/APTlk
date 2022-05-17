package com.example.conec;

import java.lang.constant.Constable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class DatabaseHandler extends configs {
    Connection dbCOnnection;

    public Connection getDbCOnnection() throws ClassNotFoundException, SQLException {

        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbCOnnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbCOnnection;


    }
    public void signUpUser(User user){


        String insert = "INSERT INTO" + constant.USER_TABLE + "(" + constant.USER_NAME + "," + constant.USER_SURNAME + "," + constant.USER_LOGIN +
                "," + constant.USER_PASSWORD + ")" +
                "VALUES(?,?,?,?)";

        try {
            PreparedStatement prSt = getDbCOnnection().prepareStatement(insert);
            prSt.setString(1,user.getName());
            prSt.setString(2,user.getSurname());
            prSt.setString(3,user.getLogin());
            prSt.setString(4,user.getPassword());
            prSt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
    public ResultSet getUser(User user ){
        ResultSet resSet = null;

        String select = "select * from intointopol where login =? AND password =?";
        try {
            PreparedStatement prSt = getDbCOnnection().prepareStatement(select);

            prSt.setString(1,user.getLogin());
            prSt.setString(2,user.getPassword());

            resSet =  prSt.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resSet;
    }



}
