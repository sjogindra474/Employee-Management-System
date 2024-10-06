
// import java.beans.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;


// public class jdbc1{
// public static void main(String[] args) {
//     try {
      

//         Class.forName("com.mysql.cj.jdbc.Driver");

//         String url = "jdbc:mysql://localhost:3306/check1";
//         String username = "root";
//         String password = "Jogi@9625";

//         try (Connection con = DriverManager.getConnection(url, username, password)) {
//             String q = "create table Labour(id int, name varchar(10))";
//             Statement stmt = (Statement) con.createStatement();
            
//             ((java.sql.Statement) stmt).executeUpdate(q);
//         }

//     }catch(Exception e) {
//         e.printStackTrace();
//     }
// }
// }

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Correct the JDBC URL format
            String url = "jdbc:mysql://localhost:3306/employemanagement";
            String username = "root";
            String password = "Jogi@9625";

            // Establish the connection
            try (Connection con = DriverManager.getConnection(url, username, password)) {
                // SQL query to create a table
                String q = "CREATE TABLE login (username VARCHAR(20), password varchar(20))";
                
                // Create a statement
                Statement stmt = con.createStatement();
                
                // Execute the SQL query
                stmt.executeUpdate(q);
                
                System.out.println("Table created successfully.");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class statement {

        public statement() {
        }
    }
}
    */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    Connection con;
    Statement stmt;

    public Conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection
            String url = "jdbc:mysql://localhost:3306/employemanagement";
            String username = "root";
            String password = "Jogi@9625";

            // Establish the connection
            con = DriverManager.getConnection(url, username, password);
            
            // Create a statement object for executing SQL queries
            stmt = con.createStatement();

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

