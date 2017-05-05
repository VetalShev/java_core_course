package ru.vetalshev.jdbc.example1;

import ru.vetalshev.jdbc.model.Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class SimpleJDBCRunner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        Properties prop = new Properties();
        prop.put("user", "vetalshev");
        prop.put("password", "vetalshev");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        prop.put("useSSL", "true");

        Connection cn = null;

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try { // 1 блок
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;
            try { // 2 блок
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 блок
                    rs = st.executeQuery("SELECT * FROM country");
                    ArrayList<Country> countries = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        countries.add(new Country(id, name));
                    }
                    if (countries.size() > 0) {
                        for (Country country : countries) {
                            System.out.println(country);
                        }
                    } else {
                        System.out.println("Not found");
                    }
                } finally { // для 3-го блока try
                    /*
                    * закрыть ResultSet, если он был открыт
                    * или ошибка произошла во время
                    * чтения из него данных
                    */
                    if (rs != null) { // был ли создан ResultSet
                        rs.close();
                    } else {
                        System.err.println("Reading DB error");
                    }
                }
            } finally {
                /*
                * закрыть Statement, если он был открыт или ошибка
                * произошла во время создания Statement
                */
                if (st != null) { // для 2-го блока try
                    st.close();
                } else {
                    System.err.println("Statement isn't defined");
                }
            }
        } catch (SQLException e) { // для 1-го блока try
            System.err.println("DB connection error: " + e);
            /*
            * вывод сообщения о всех SQLException
            */
        } finally {
            /*
            * закрыть Connection, если он был открыт
            */
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Сonnection close error: " + e);
                }
            }
        }
    }
}