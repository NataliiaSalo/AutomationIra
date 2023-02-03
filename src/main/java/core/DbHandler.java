package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHandler {
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "2304";
    private static final String DB_NAME = "automation";
    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;

    public static Connection getDbConnection() {
        Connection connection = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public static void closeDbConnection(Statement stmt, Connection connection) {
        try {
            stmt.close();
            connection.close();
        } catch (SQLException se) {
            //log it
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                //log it
            }
        }
    }
}

