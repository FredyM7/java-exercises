package org.fmunera.example.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection;

        public static Connection getInstance() throws SQLException {
            if(connection == null){
                String url = "jdbc:mysql://localhost:3306/users_bd?serverTimeZone=America/Bogota";
                String username = "root";
                String password = "famr";
                connection = DriverManager.getConnection(url, username, password);
            }

            return connection;
        }
}
