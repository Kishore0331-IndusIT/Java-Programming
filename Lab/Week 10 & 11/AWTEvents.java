import java.awt.*;
import java.awt.event.*;

public class AWTEvents extends Frame
{

    // Constructor to set up the Frame and event listeners
    public AWTEvents()
	{
        setTitle("AWT Mouse and Keyboard Event Handling");
        setSize(400, 400);
        setLayout(null); // Use null layout for simplicity

        // Add a KeyListener for keyboard events
        addKeyListener(new KeyAdapter()
		{
            public void keyPressed(KeyEvent e)
			{
                System.out.println("Key Pressed: " + e.getKeyChar());
            }

            public void keyReleased(KeyEvent e)
			{
                System.out.println("Key Released: " + e.getKeyChar());
            }

            public void keyTyped(KeyEvent e)
			{
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });

        // Add a MouseListener for mouse events
        addMouseListener(new MouseAdapter()
		{
            public void mouseClicked(MouseEvent e)
			{
                System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mousePressed(MouseEvent e)
			{
                System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseReleased(MouseEvent e)
			{
                System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseEntered(MouseEvent e)
			{
                System.out.println("Mouse Entered the component");
            }

            public void mouseExited(MouseEvent e)
			{
                System.out.println("Mouse Exited the component");
            }
        });

        // Make the frame focusable to listen for key events
        setFocusable(true);
        requestFocusInWindow();

        // Set frame to be visible and set the close operation
        setVisible(true);
        addWindowListener(new WindowAdapter()
		{
            public void windowClosing(WindowEvent we)
			{
                System.exit(0);  // Close the application
            }
        });
    }

    public static void main(String[] args)
	{
        // Create and display the Frame
        new AWTEvents();
    }
}
