package ru.vetalshev.jdbc.example2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {

    public static Connection getConnection () throws SQLException {
        Properties config = new Properties();
        InputStream configFile = null;

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        Class.forName("com.mysql.jdbc.Driver");

        try {
            configFile = new FileInputStream("src/ru/vetalshev/jdbc/database.properties");

            config.load(configFile);
            String url = config.getProperty("url");

            return DriverManager.getConnection(url, config);

        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            if (configFile != null) {
                try {
                    configFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
