import java.sql.*;

public class CRUDExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "Abhishek@21012007";

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to database successfully!");

            Statement stmt = con.createStatement();

            // ==================== SELECT ====================

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("\nInitial Student Table:");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " " + name + " " + marks);
            }

            // ==================== INSERT ====================

            String insertQuery = "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement ps1 = con.prepareStatement(insertQuery);

            ps1.setInt(1, 102);
            ps1.setString(2, "Amit");
            ps1.setInt(3, 88);

            ps1.executeUpdate();

            System.out.println("\nUpdated Table after INSERT query:");

            rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " " + name + " " + marks);
            }

            // ==================== UPDATE ====================

            String updateQuery = "UPDATE student SET marks=? WHERE id=?";

            PreparedStatement ps2 = con.prepareStatement(updateQuery);

            ps2.setInt(1, 95);
            ps2.setInt(2, 102);

            ps2.executeUpdate();

            System.out.println("\nUpdated Table after UPDATE query:");

            rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " " + name + " " + marks);
            }

            // ==================== DELETE ====================

            String deleteQuery = "DELETE FROM student WHERE id=?";

            PreparedStatement ps3 = con.prepareStatement(deleteQuery);

            ps3.setInt(1, 102);

            ps3.executeUpdate();

            System.out.println("\nUpdated Table after DELETE query:");

            rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " " + name + " " + marks);
            }

            // Close connection
            con.close();

            System.out.println("\nCRUD operations done!");

        } catch (Exception e) {

            System.out.println("Error: " + e);

        }
    }
}