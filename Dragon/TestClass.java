import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
   { 
       DrawingPanel panel = new DrawingPanel(500,500);
       Graphics g = panel.getGraphics();
       
       Dragon Drag= new Dragon();
      
      
      
     
       Dragon BK = new Dragon (200,200,1, Color.BLUE);
       BK.drawDragon(g);
       BK.clearRect(g);
       Thread.sleep(3000);
       BK.grow(g);
       Dragon Brando = new Dragon (200,200,3, Color.RED);
   
       
       
       
       
    }
}
} 
