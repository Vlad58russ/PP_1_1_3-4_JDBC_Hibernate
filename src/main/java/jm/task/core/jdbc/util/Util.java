package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String userName = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/mydbtest";

    public static Connection getConnection() throws SQLException {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            return connection;
        }
    }
}