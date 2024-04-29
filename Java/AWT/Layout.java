import javax.swing.*;
import java.awt.*;

public class Layout{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Managers Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(3, 2));
        for (int i = 1; i <= 6; i++) {
            gridPanel.add(new JButton("Button " + i));
        }

        // BoxLayout
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Button 1"));
        boxPanel.add(new JButton("Button 2"));
        boxPanel.add(new JButton("Button 3"));

        // Add panels to frame
        frame.add(borderPanel, BorderLayout.NORTH);
        frame.add(flowPanel, BorderLayout.CENTER);
        frame.add(gridPanel, BorderLayout.SOUTH);
        frame.add(boxPanel, BorderLayout.WEST);

        frame.setVisible(true);
    }
}

