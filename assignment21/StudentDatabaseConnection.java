import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "dhruv";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            if (con != null) {
                System.out.println("Student database connected successfully!");
            }

            con.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}