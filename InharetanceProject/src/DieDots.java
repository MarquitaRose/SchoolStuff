import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class DieDots extends Applet {

	public void paint(Graphics g){
		BlackBlobs numbers = new BlackBlobs(g); //creates new BlackBlobs
	}
}


class BlackBlobs extends Cube{
	private int theX= 600;
	public BlackBlobs(Graphics g){
		dotsss(g);
	 }
	 
	 public static void dotsss(Graphics g){
		 
		int theX = 600;      //defining the values
		int theY = 250;
		int theWidth = 250;
		int theHeight =250; 
		
		 g.fillOval(theX+(theWidth/5), theY+(theHeight/5), theWidth/5, theHeight/5);        //creates the dots that will go on the face of the cube
			g.fillOval(theX+3*(theWidth/5), theY+3*(theHeight/5), theWidth/5, theHeight/5);
			g.fillOval(theX+(theWidth/5),  theY+3*(theHeight/5), theWidth/5, theHeight/5);
			g.fillOval(theX+3*(theWidth/5), theY+(theHeight/5), theWidth/5, theHeight/5);
			
			g.fillOval(theX-70, theY+55, theWidth/6, theHeight/5);                              //creates the dot on the side
			
			g.fillOval(theX, theY-85, theWidth/5, theHeight/6);
			g.fillOval(theX+100, theY-60, theWidth/5, theHeight/6);
	 }
	 
}