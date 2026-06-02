package ma.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/bdarticles";
    private final String user = "root";
    private final String password = "root123";
    private DBConnection() {
        try        {
            // System.out.println("Loading Driver...");
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // System.out.println("Driver loaded");
            connection= DriverManager.getConnection(url,user,password);
            System.out.println("Database connection opened");        }
        // catch (ClassNotFoundException e) {
        //     System.out.println("Driver not found");}
        catch(SQLException e){
            System.out.println("Connection Failed! Check output console"+e.getMessage());        }    }
    public Connection getConnection() {        return connection;    }
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();        }
        return instance;    }
}
