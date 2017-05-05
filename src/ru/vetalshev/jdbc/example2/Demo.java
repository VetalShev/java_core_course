package ru.vetalshev.jdbc.example2;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo {

    public static void main(String[] args) throws SQLException {

        Connection cn = DBConnector.getConnection();

        System.out.println("The connection has been set");

    }

}
