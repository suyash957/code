import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu{
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Menu Bars Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Menu-A
        JMenuBar menuBarA = new JMenuBar();
        JMenu menuA = new JMenu("Menu-A");
        JMenuItem upMenuItem = new JMenuItem("Up");
        JMenuItem downMenuItem = new JMenuItem("Down");

        // Add action listeners for Menu-A items
        upMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Up action logic here
                System.out.println("Up action performed");
            }
        });

        downMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Down action logic here
                System.out.println("Down action performed");
            }
        });

        menuA.add(upMenuItem);
        menuA.add(downMenuItem);
        menuBarA.add(menuA);

        // Create Menu-B
        JMenuBar menuBarB = new JMenuBar();
        JMenu menuB = new JMenu("Menu-B");
        JMenuItem resetMenuItem = new JMenuItem("Reset");

        // Add action listener for Menu-B item
        resetMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset action logic here
                System.out.println("Reset action performed");
            }
        });

        menuB.add(resetMenuItem);
        menuBarB.add(menuB);

        // Add menu bars to the frame
        frame.setJMenuBar(menuBarA);
        frame.getContentPane().add(menuBarB);

        // Display the frame
        frame.setVisible(true);
    }
}
