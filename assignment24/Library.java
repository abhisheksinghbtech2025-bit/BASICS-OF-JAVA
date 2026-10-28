import javax.swing.*;
import java.sql.*;

public class Library {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java", "root", "dhruv");
        c.createStatement().executeUpdate(
            "CREATE TABLE IF NOT EXISTS books(id INT PRIMARY KEY,name VARCHAR(50))");

        JFrame f = new JFrame("Library Management");
        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JButton b = new JButton("Add Book");

        f.setLayout(new java.awt.GridLayout(3, 2));
        f.add(new JLabel("Book ID"));
        f.add(id);
        f.add(new JLabel("Book Name"));
        f.add(name);
        f.add(b);

        b.addActionListener(e -> {
            try {
                PreparedStatement p = c.prepareStatement("INSERT INTO books VALUES(?,?)");
                p.setInt(1, Integer.parseInt(id.getText()));
                p.setString(2, name.getText());
                p.executeUpdate();
                JOptionPane.showMessageDialog(f, "Book Added");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, ex.getMessage());
            }
        });

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}