import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener
{
    // Declare all components
    TextField display;
    Button add, subtract, multiply, divide, equals, clear;
    double num1, num2, result;
    char operator;

    // Constructor to set up the GUI
    public Calculator()
	{
        // Set title and layout
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Create display (TextField)
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Panel to hold number buttons
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4)); // 4 rows, 4 columns
    
Button b0 = new Button("0");
Button b1 = new Button("1");
Button b2 = new Button("2");
Button b3 = new Button("3");
Button b4 = new Button("4");
Button b5 = new Button("5");
Button b6 = new Button("6");
Button b7 = new Button("7");
Button b8 = new Button("8");
Button b9 = new Button("9");
// Create operator buttons
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
         divide = new Button("/");
        equals = new Button("=");
        clear = new Button("C");
 b0.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
  b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
  b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
      
        // Add action listeners to the operator buttons
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);

        // Add operator buttons to the panel (in GridLayout)
       panel.add(b7);
 panel.add(b8);
 panel.add(b9);
panel.add(clear);
   panel.add(b4);
 panel.add(b5);
 panel.add(b6);
 panel.add(divide);
 
 panel.add(b1);
 panel.add(b2);
 panel.add(b3);
 panel.add(multiply);
 panel.add(b0);
  panel.add(add);
   panel.add(subtract);
   panel.add(equals);
        

        // Add the panel to the frame
        add(panel, BorderLayout.CENTER);

        // Window closing event
        addWindowListener(new WindowAdapter()
		{
            public void windowClosing(WindowEvent we)
			{
                System.exit(0);
            }
        });

        // Set the frame visible
        setVisible(true);
    }

    // ActionListener method to handle button clicks
    public void actionPerformed(ActionEvent e)
	{
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9'))
		{
            // If a number is pressed, add it to the display
            display.setText(display.getText() + command);
        } 
		else if (command.charAt(0) == 'C')
		{
            // Clear the display when 'C' is pressed
            display.setText("");
        } 
		else if (command.charAt(0) == '=')
		{
            // When '=' is pressed, calculate the result
            num2 = Double.parseDouble(display.getText());
            switch (operator)
			{
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
					{
                        result = num1 / num2;
                    } 
					else
					{
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(result));
            num1 = result; // Store result for further calculation
        } 
		else
		{
            // When an operator is pressed, store the number and operator
            if (!display.getText().isEmpty())
			{
                num1 = Double.parseDouble(display.getText());
                operator = command.charAt(0);
                display.setText("");
            }
        }
    }

    public static void main(String[] args)
	{
        // Create an instance of the Calculator class
        new Calculator();
    }
}
