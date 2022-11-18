package com.vti.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    int Abc;
    // Tạo 1 method chuyên dùng để conect tới My Sql
    public static Connection getConect(){

        Connection connection = null;
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("Lesson-10/src/main/resources/db.properties"));
            // Những thông số để connect -> My SQL
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String pass = properties.getProperty("password");
            String driver = properties.getProperty("driver");

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            if (connection != null) {
                System.out.println("Thanh cong1");
            } else {
                System.out.println("That bai");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("abc");
        }
        return connection;
    }
}
