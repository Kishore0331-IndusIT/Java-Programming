import java.awt.*;  
import java.awt.event.*;  
public class AWTMouseEvent extends Frame implements MouseListener
{  
    Label l;  
    AWTMouseEvent()
	{  
        addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true); 
        addWindowListener(new WindowAdapter()
		{
            public void windowClosing(WindowEvent we)
			{
                System.exit(0);  // Close the application
            }
        });			
    }  
    public void mouseEntered(MouseEvent e)
	{  
        l.setText("Mouse Entered"); 
        System.out.println("Mouse Entered the component");		
    }  
    public void mouseExited(MouseEvent e)
	{  
        l.setText("Mouse Exited");  
		System.out.println("Mouse Exited the component");
    }  
	public void mousePressed(MouseEvent e)
	{  
        l.setText("Mouse Pressed"); 
        System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");		
    }  
    public void mouseReleased(MouseEvent e)
	{  
        l.setText("Mouse Released");
        System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");		
    }  
	public void mouseClicked(MouseEvent e)
	{  
        l.setText("Mouse Clicked"); 
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");		
    }  
    
    
public static void main(String[] args)
{  
    new AWTMouseEvent();  
}  
}  