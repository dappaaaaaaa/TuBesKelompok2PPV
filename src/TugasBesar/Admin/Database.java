package TugasBesar.Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            String host = "jdbc:mysql://localhost:3306/db_dinenear?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "";

            try {
                conn = (Connection) DriverManager.getConnection(host, user, pass);
            } catch (SQLException e) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return conn;
    }

    static Connection databaseDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
