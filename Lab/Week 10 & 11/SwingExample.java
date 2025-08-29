import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample extends JFrame {

    // Constructor to set up the frame and components
    public SwingExample() {
        // Set the title of the window
        setTitle("Swing Example");

        // Set the layout of the frame
        setLayout(new FlowLayout());

        // Create a JLabel to display the greeting message
        JLabel label = new JLabel("Enter your name:");

        // Create a JTextField for user input
        JTextField textField = new JTextField(20); // Width is 20 columns

        // Create a JButton
        JButton button = new JButton("Greet Me");

        // Create an action listener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the text field
                String name = textField.getText();

                // Update the label to greet the user
                label.setText("Hello, " + name + "!");
            }
        });

        // Add the components to the frame
        add(label);
        add(textField);
        add(button);

        // Set the default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
    }

    public static void main(String[] args) {
        // Create an instance of SwingExample and make it visible
        SwingExample frame = new SwingExample();
        frame.setVisible(true);
    }
}
