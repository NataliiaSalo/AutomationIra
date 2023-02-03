package business_objects;

import core.DbHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteSQL {
    public static void executeInsertSQl() {
        //DbHandler dbHandler = new DbHandler();
        System.out.println("Execute SQL:");
        try (Connection connection = DbHandler.getDbConnection();
             Statement stmt = connection.createStatement();) {
            stmt.addBatch("INSERT INTO automation VALUES(2, 'comments', 'text')");
            stmt.executeBatch();
            DbHandler.closeDbConnection(stmt, connection);
            System.out.println("Done");
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}
