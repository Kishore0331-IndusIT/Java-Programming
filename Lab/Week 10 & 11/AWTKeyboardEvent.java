// importing awt libraries  
import java.awt.*;    
import java.awt.event.*;    

public class AWTKeyboardEvent extends Frame implements KeyListener
{    
 	Label l;
    AWTKeyboardEvent()
	{    
          // creating the label  
        l = new Label();    
// setting the location of the label in frame  
        l.setBounds (20, 50, 100, 20);    
// creating the text area  
       TextArea area = new TextArea();    
// setting the location of text area   
        area.setBounds (20, 80, 300, 300);    
// adding the KeyListener to the text area  
        area.addKeyListener(this);  
// adding the label and text area to the frame  
        add(l);  
add(area);    
// setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);   
        addWindowListener(new WindowAdapter()
		{
            public void windowClosing(WindowEvent we)
			{
                System.exit(0);  // Close the application
            }
        });		
    }    
// overriding the keyPressed() method of KeyListener interface where we set the text of the label when key is pressed  
    public void keyPressed (KeyEvent e)
	{    
        l.setText ("Key Pressed");  
        int keyCode = e.getKeyCode();
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));		
    }    
// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e)
	{    
        l.setText ("Key Released");  
        int keyCode = e.getKeyCode();
        System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));		
    }    
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e)
	{    
        l.setText ("Key Typed");  
	    char keyChar = e.getKeyChar();
        System.out.println("Key Typed: " + keyChar);
    }    
  // main method  
    public static void main(String[] args)
	{    
        new AWTKeyboardEvent();    
    }    
}   