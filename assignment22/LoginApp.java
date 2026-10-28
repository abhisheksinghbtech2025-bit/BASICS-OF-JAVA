import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String dbPassword = "dhruv";

        String sql = "SELECT * FROM login WHERE username = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, dbPassword);

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful!");
                System.out.println("Welcome, " + rs.getString("username"));
            }
            else {
                System.out.println("Invalid username or password.");
            }

            rs.close();
            pst.close();
            con.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        scanner.close();
    }
}