import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int grow1;
    private int size;
    private Color c;
    private String bodyType;
    private int headheight;
    private int bodyheight;
    private int legheight;
    private int headwidth;
    private int bodywidth;
    private int totalwidth;
    private int totalheight;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.RED;
    }
    public Dragon(int x, int y, int size, Color c){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c;
    }
    
    
    
    /**
     * Overloaded Constructors go here
     */
    
    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c);
        headheight = size * 25;
        headwidth = size * 25;
        bodywidth = size * 50;
        bodyheight = size * 50;
        legheight = size * 50;
        g.fillRect(x, y, headwidth, headheight);//Dragon Head
        g.fillRect(x + size*25, y + size*25, bodywidth, bodyheight);//body
        g.fillRect(x + size*25, (y + size*25) + size * 50, size*10, legheight);//Left leg
        g.fillRect((x + size*25) + size * 40, (y + size*25) + size * 50, size *10, legheight);//Right leg
        
        
    }
    public void clearRect (Graphics g)
    {
        totalwidth = headwidth + bodywidth; 
        totalheight = headheight + bodyheight + legheight; 
        g.setColor(Color.white); 
        g.fillRect(x, y, totalwidth, totalheight);
        
        
     
    }
    public void grow (Graphics g)
    {
     grow1 = size*2;        
         
      
    }
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + "color" + c;
    }
}
