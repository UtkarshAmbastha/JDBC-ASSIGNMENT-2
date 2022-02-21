package com.knoldus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnection {

    final static String className = "com.mysql.cj.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/Shopping";
    final static String USER_NAME = "root";
    final static String password = "utkarsh@15";


    public static Connection getDbConnection () throws Exception {

        PreparedStatement preparedStatement = null;
        Class.forName(className);
        Connection connection = DriverManager.getConnection(URL, USER_NAME, password);
        return connection;
    }
}
