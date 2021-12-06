import java.awt.*;
import javax.swing.JFrame;

public class Lab4bst extends Canvas {
   //set width and height of canvas
   private static int Cwidth = 1000;
   private static int Cheight = 800;
   
   public static void main(String[] args) {
      JFrame frame = new JFrame("Your Name Here");
      //main method has to exist in file being run
      //code below create a jframe with a canvas on it
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Lab4bst();//constructor must match class name
      canvas.setSize(Cwidth, Cheight);
      canvas.setBackground(Color.WHITE);//colors:RED,GREEN,BLUE,YELLOW,MAGENTA,CYAN,WHITE,BLACK,GRAY,LIGHT_GRAY,DARK_GRAY,PINK,ORANGE    
      frame.add(canvas);
      frame.pack();
      frame.setVisible(true);
      //end canvas code, do not edit
   }

   public void paint(Graphics g) {
      g.setColor(Color.BLACK);
      //all drawing code goes here
      // DRAW CUBE



		// DRAW SPHERE



		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



		// DRAW APCS
      // A
      
      // P
      
      // C
      
      // S


		// DRAW PACMAN FLOWER
   }
}