import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login{
    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "password";
    private static final String USER_INFO = "User Information:\nName: John Doe\nAge: 30\nEmail: john@example.com";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Application");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                    // Login successful
                    JOptionPane.showMessageDialog(frame, USER_INFO, "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                    messageLabel.setText("");
                } else {
                    // Login failed
                    JOptionPane.showMessageDialog(frame, "Wrong username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                    messageLabel.setText("Wrong username or password");
                }
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(messageLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}

