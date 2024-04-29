import javax.swing.*;
import java.awt.*;

public class Admission{
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Admission Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5)); // 5 rows, 2 columns

        // Add labels and text fields for form elements
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel(new GridLayout(1, 2));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);

        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"Computer Science", "Engineering", "Mathematics", "Physics"};
        JComboBox<String> courseComboBox = new JComboBox<>(courses);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressTextArea = new JTextArea();

        // Add elements to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(genderLabel);
        panel.add(genderPanel);
        panel.add(courseLabel);
        panel.add(courseComboBox);
        panel.add(addressLabel);
        panel.add(addressTextArea);

        // Create submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            // Perform actions on submission
            String name = nameField.getText();
            String age = ageField.getText();
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";
            String course = (String) courseComboBox.getSelectedItem();
            String address = addressTextArea.getText();

            // Print form data
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Course: " + course);
            System.out.println("Address: " + address);
        });

        // Add submit button to panel
        panel.add(submitButton);

        // Add panel to frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }
}

