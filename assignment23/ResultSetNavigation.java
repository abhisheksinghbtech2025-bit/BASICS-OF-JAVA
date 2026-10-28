
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetNavigation {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String dbPassword = "dhruv";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, dbPassword);

            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM employee1 ORDER BY emp_id");

            // Display first record
            if (rs.first()) {
                System.out.println("First Record:");
                displayRecord(rs);
            } else {
                System.out.println("No employee records found.");
            }

            // Move to next record
            if (rs.next()) {
                System.out.println("\nNext Record:");
                displayRecord(rs);
            }

            // Move to previous record
            if (rs.previous()) {
                System.out.println("\nPrevious Record:");
                displayRecord(rs);
            }

            // Move to last record
            if (rs.last()) {
                System.out.println("\nLast Record:");
                displayRecord(rs);
            }

            // Move to the third record
            if (rs.absolute(3)) {
                System.out.println("\nThird Record:");
                displayRecord(rs);
            }

            // Move one record forward
            if (rs.relative(1)) {
                System.out.println("\nRelative Next Record:");
                displayRecord(rs);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: "
                    + e.getMessage());

        } catch (SQLException e) {
            System.out.println("Database error: "
                    + e.getMessage());
        }
    }

    static void displayRecord(ResultSet rs) throws SQLException {
        System.out.println("Employee ID: " + rs.getInt("emp_id"));
        System.out.println("Name: " + rs.getString("name"));
        System.out.println("Department: " + rs.getString("department"));
        System.out.println("Salary: " + rs.getDouble("salary"));
    }
}
