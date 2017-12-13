/*
 * Name: Rajib Chandra Das
 * Reg: 2009331008
 * Dept: Computer Science & Engineering
 * Course ID: CSE-354
 * Instructor: Dr. M. Jahirul Islam
 */

import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.Media;
import javax.swing.JApplet;
import javax.swing.JFrame;


public class aquarium 
{
    public static JFrame frame1,frame2;
    public static AudioClip a;
    public static void main(String[] args) 
    {
        try {
            a=JApplet.newAudioClip(new URL("file:sounds/backMusicq.wav"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(aquarium.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Thread snd=new Thread(new ThreadSound());
        snd.start();
        frame1 = new Front_Page();
        //frame2=new animation();
        


        
    }
}
