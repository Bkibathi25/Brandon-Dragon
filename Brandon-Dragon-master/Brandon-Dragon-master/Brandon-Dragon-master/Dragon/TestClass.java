import java.util.Scanner;
import java.util.ArrayList;
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
       ArrayList<Dragon> drag = new ArrayList<Dragon>();
       String colorth;
       
       BackgroundDragon Scene = new BackgroundDragon();
       Scene.drawbackground(g);
       
       
       System.out.print("pick 2 from the following colors: RED , BLUE, CYAN , YELLOW");
       do{ 
           colorth = Scanner.nextstring();
       
            if(colorth.equals("Red")){
                drag.add((new Dragon(100,100,1,Color.RED)));
            }
            else if(colorth.equals("Blue")){
                drag.add((new Dragon(200,200,1,Color.Blue)));
            }
            else if(colorth.equals("Cyan")){
                drag.add((new Dragon(300,300,1,Color.CYAN)));    
            }
            else if(colorth.equals("Yellow")){
                drag.add((new Dragon(400,400,1,Color.YELLOW)));
            }
           
       }
       while(drag.size <= 1); 
        
        
       
       Dragon BK = new Dragon (200,200,1, Color.BLUE);
       BK.drawDragon(g);
       //BK.clearRect(g);
       //Thread.sleep(3000);
       //BK.grow(g);
       Dragon Brando = new Dragon (100,200,1, Color.RED);
       Brando.drawDragon(g);
       
       
       
       
    }
}
} 
