import java.sql.*;
import javax.swing.*;

public class BookIssue {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java", "root", "dhruv");
        c.createStatement().executeUpdate(
            "CREATE TABLE IF NOT EXISTS issues(bookid INT,student VARCHAR(50),issued DATE,returned DATE)");

        JFrame f = new JFrame("Book Issue System");
        JTextField id = new JTextField();
        JTextField student = new JTextField();
        JTextField issue = new JTextField();
        JTextField ret = new JTextField();
        JButton b = new JButton("Issue Book");

        f.setLayout(new java.awt.GridLayout(5, 2));
        f.add(new JLabel("Book ID"));
        f.add(id);
        f.add(new JLabel("Student Name"));
        f.add(student);
        f.add(new JLabel("Issue Date"));
        f.add(issue);
        f.add(new JLabel("Return Date"));
        f.add(ret);
        f.add(b);

        b.addActionListener(e -> {
            try {
                PreparedStatement p = c.prepareStatement("INSERT INTO issues VALUES(?,?,?,?)");
                p.setInt(1, Integer.parseInt(id.getText()));
                p.setString(2, student.getText());
                p.setDate(3, Date.valueOf(issue.getText()));
                p.setDate(4, ret.getText().isEmpty() ? null : Date.valueOf(ret.getText()));
                p.executeUpdate();
                JOptionPane.showMessageDialog(f, "Record Saved");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, ex.getMessage());
            }
        });

        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}