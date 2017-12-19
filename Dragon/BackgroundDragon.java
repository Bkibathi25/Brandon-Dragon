import java.awt.*;
/**
 * Write a description of class BackgroundDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundDragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int width;
    private int length;
    private Color topcolor;
    private Color bottomcolor;
    private Color topright;
    private Color c;
    /**
     * Constructor for objects of class BackgroundDragon
     */
    public BackgroundDragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        width = 500;
        length = 500;
        topcolor = Color.CYAN;
        bottomcolor = new Color(102, 51, 0);
        topright = Color.YELLOW;
      
        
    }
    public BackgroundDragon(int w, int h, Color topcolor, Color topright, Color bottomcolor){
        this.width = width;
        this.length = length;
        this.topcolor = topcolor;
        this.topright = topright;
        this.bottomcolor = bottomcolor;
        
        
    }
    
    public void drawbackground(Graphics g)
    {
        g.setColor(topcolor);
        g.fillRect(0, 0, width, (length * 3)/4);
        g.setColor(bottomcolor);
        g.fillRect(0, (width * 3)/4, width, (length * 1)/4);
        
    }

     
        
     

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
