import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalStaffLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Login ID: ");
        String loginId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String dbPassword = "dhruv";

        String sql = "SELECT * FROM hospital_staff " +
                     "WHERE login_id = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, dbPassword);

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, loginId);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String name = rs.getString("staff_name");
                String role = rs.getString("role");

                System.out.println("Login successful!");
                System.out.println("Welcome, " + name);
                System.out.println("Role: " + role);
                System.out.println("Hospital staff access granted.");

            }
            else {
                System.out.println("Invalid Login ID or Password.");
                System.out.println("Access denied.");
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