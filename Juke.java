import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
//Creates Class
public class Juke {

   public static boolean songPlaying = false;//Boolean to tell if song is playing
   private static JButton toto;
   private static JButton oceanman;
   private static JButton pumpedupkicks;
   private static JButton midnight;
   public static Clip local;//Variable to determine which clip to stop
   
   public Juke()//Juke Method
   {    
		JFrame f=new JFrame("Wakanda");            
		toto = new JButton("Play", new ImageIcon("toto.jpg"));
		toto.setBounds(10,10,210,210);    
		f.add(toto);//Adds Toto button
		oceanman = new JButton("Play", new ImageIcon("oceanman.jpg"));
		oceanman.setBounds(225,10,210,210);         
      f.add(oceanman);//Ads Oceanman button
		pumpedupkicks = new JButton("Play", new ImageIcon("pumpedupkicks.jpg"));
		pumpedupkicks.setBounds(440,10,210,210);         
      f.add(pumpedupkicks);//Adds Pumped Up Kicks button
		midnight = new JButton("Play", new ImageIcon("midnight.jpg"));
		midnight.setBounds(655,10,210,210);         
      f.add(midnight);//Adds Midnight button
		f.setSize(1000,800);//Sets canvas size
		f.setLayout(null);    
		f.setVisible(true);//Canvas is now visible
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   } 
		public static void main(String[] args) {    
		   Juke j = new Juke();
         //Actions Listeners Below
   		toto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
               if(songPlaying == false){
                  j.sound("Africa.wav", 1);
                  songPlaying = true;
               } else if(songPlaying) {
                  j.sound("Africa.wav", 0);
                  songPlaying = false;
               }			
			}          
	      });
   		oceanman.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
               if(songPlaying == false){
                  j.sound("oceanman.wav", 1);
                  songPlaying = true;
               } else if(songPlaying) {
                  j.sound("oceanman.wav", 0);
                  songPlaying = false;
               }          			
			}          
	      });
   		pumpedupkicks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
               if(songPlaying == false){
                  j.sound("pumpedupkicks.wav", 1);
                  songPlaying = true;
               } else if(songPlaying) {
                  j.sound("pumpedupkicks.wav", 0);
                  songPlaying = false;
               }
               			
			}          
	      });
   		midnight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
               if(songPlaying == false){
                  j.sound("midnight.wav", 1);
                  songPlaying = true;
               } else if(songPlaying) {
                  j.sound("midnight.wav", 0);
                  songPlaying = false;
               }
               			
			}          
	      });
            
            
		}
      public void sound(String song, int x) {
      
         try {
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(song));//Sets audio input to variable called with Song() method
         
         Clip clip = AudioSystem.getClip();
         clip.open(audioInputStream);        


         if(x == 1){
         clip.start();//Starts the clip
         local = clip; //Saves the clip ID
         System.out.println(clip);//Prints the clip ID for future debugging

         } else if(x == 0){
         System.out.println(local);
         local.stop();
         }
        // return clip;
         // If you want the sound to loop infinitely, then put: clip.loop(Clip.LOOP_CONTINUOUSLY); 
         // If you want to stop the sound, then use clip.stop();
           }  catch (Exception ex) {
         ex.printStackTrace();
            }
            }
         //return null;
}
 