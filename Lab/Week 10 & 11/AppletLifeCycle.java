import java.applet.Applet;
import java.awt.*;
import java.util.Date;

/*
<applet code="AppletLifeCycle" width=300 height=200>
    <param name="greeting" value="Welcome to Java Applet">
    <param name="author" value="VJIT">
</applet>
*/

public class AppletLifeCycle extends Applet
{

    // Instance variables to store parameter values
    private String greetingMessage;
    private String author;

    // Called when the applet is first loaded into memory
    @Override
    public void init()
	{
        // Retrieve parameters from the applet tag
        greetingMessage = getParameter("greeting");  // Get greeting message
        author = getParameter("author");  // Get author name

        if (greetingMessage == null)
		{
            greetingMessage = "Hello, this is a default greeting!";
        }
        if (author == null)
		{
            author = "Unknown Author";
        }

        System.out.println("Applet Initialized");
    }

    // Called when the applet is started or brought to the foreground
    @Override
    public void start()
	{
        System.out.println("Applet Started");
    }

    // Called to display the applet on the screen
    @Override
    public void paint(Graphics g)
	{
        // Display greeting message and author name on the applet
        g.drawString(greetingMessage, 20, 50);
        g.drawString("Author: " + author, 20, 70);

        // Display current date and time
        g.drawString("Current Date: " + new Date(), 20, 90);
    }

    // Called when the applet is stopped (i.e., the user navigates away)
    @Override
    public void stop()
	{
        System.out.println("Applet Stopped");
    }

    // Called when the applet is destroyed
    @Override
    public void destroy()
	{
        System.out.println("Applet Destroyed");
    }
}
