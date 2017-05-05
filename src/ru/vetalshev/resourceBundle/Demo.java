package ru.vetalshev.resourceBundle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

// пример использования ResourceBundle на примере подключения к БД
public class Demo {

    public static void main(String[] args) {
        ResourceBundle resource;

        try {
            resource = ResourceBundle.getBundle("ru.vetalshev.resourceBundle.database", new Locale("ru", "RU"));
        } catch (MissingResourceException ex) {
            throw new MissingResourceException("MissingResourceException", "ResourceBundle", "database");
        }

        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String password = resource.getString("db.password");

        try {
            Connection con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("=================");
        System.out.println("Connected to " + resource.getString("db.url"));
        System.out.println("=================");

    }

}
