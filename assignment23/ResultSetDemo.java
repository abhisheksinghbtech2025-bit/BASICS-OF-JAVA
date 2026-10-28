
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String dbPassword = "dhruv";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, dbPassword);

            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM employee1";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employee Records:");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("emp_id"));
                System.out.println(
                    "Name: " + rs.getString("name"));
                System.out.println(
                    "Department: " + rs.getString("department"));
                System.out.println(
                    "Salary: " + rs.getDouble("salary"));
                System.out.println("----------------------");
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
