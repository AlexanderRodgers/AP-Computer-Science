/*******
 * Face.java
 * Alex Rodgers
 * 6 September 2016
 * 
 * A picture of me.
 ********/
import java.applet.Applet;
import java.awt.*;
public class Face extends Applet {
    public void paint (Graphics g) {
        final int MID = 230;
        final int HEIGHT = 342;
        Color skinColor = new Color(255,224,189);
        Color eyeColor = new Color(139,69,19);

        setBackground(Color.cyan);

        //Hair
        g.setColor(eyeColor);
        g.fillOval(MID-120, HEIGHT-210, 70, 70);
        g.fillOval(MID+80, HEIGHT-210, 70, 70);
        g.fillOval(MID+60, HEIGHT-240, 70, 70);
        g.fillOval(MID-100, HEIGHT-240, 70, 70);
        g.fillOval(MID-80, HEIGHT-270, 70, 70);
        g.fillOval(MID+40, HEIGHT-270, 70, 70);
        g.fillOval(MID, HEIGHT-270, 70, 70);
         g.fillOval(MID-20, HEIGHT-270, 70, 70);
        
        //Ears
        g.setColor(skinColor);
        g.fillOval(MID-140, HEIGHT-140, 40, 70);
        g.fillOval(MID+120, HEIGHT-140, 40, 70);

        //Face
        g.setColor(skinColor);
        g.fillOval(MID-120, HEIGHT-242, MID+30, HEIGHT);
        g.fillOval(MID-120, HEIGHT-242, MID+30, HEIGHT);
       

        //Eyes
        g.setColor(Color.white);
        g.fillOval(MID-80, HEIGHT-180, 70, 40);
        g.fillOval(MID+20, HEIGHT-180, 70, 40);

        //Eye Holes
        g.setColor(eyeColor);
        g.fillOval(MID-60, HEIGHT-173, 30, 30);
        g.fillOval(MID+40, HEIGHT-173, 30, 30);

        //Pupils
        g.setColor(Color.black);
        g.fillOval(MID-52, HEIGHT-165, 15, 15);
        g.fillOval(MID+48, HEIGHT-165, 15, 15);

        //Nose
        g.drawLine(MID, HEIGHT-100, MID-25, HEIGHT-20);
        g.drawLine(MID-25, HEIGHT-20, MID, HEIGHT-20);

        //Mouth
        g.drawArc(MID-20,HEIGHT+30,40,20,0,180);

    }
}
