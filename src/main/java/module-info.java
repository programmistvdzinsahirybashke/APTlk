module com.example.conec {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;
    requires jdk.internal.opt;
    requires java.sql;
    requires mysql.connector.java;

    opens com.example.conec to javafx.fxml;
    exports com.example.conec;
}