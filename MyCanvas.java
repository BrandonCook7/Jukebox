import java.awt.*;
import javax.swing.*;

public class MyCanvas extends Canvas {
    public MyCanvas() {
    }

    public void paint(Graphics graphics) {
      graphics.setColor(Color.black);
      graphics.drawLine(40, 30, 330, 380);
      graphics.drawRect(10, 10, 100, 100);
    
    }

    public static void main(String[] args) {
        // We initialize our class here
        MyCanvas canvas = new MyCanvas();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Here we add it to the frame
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}