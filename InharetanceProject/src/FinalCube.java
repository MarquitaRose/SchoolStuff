import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;


public class FinalCube extends Applet{
	public void paint(Graphics g){
	Diieee die = new Diieee(g); //creates new SingleDie
	}
}

class CubeCuba{
	int theX = 600;       //declares variables that would help new cubes to be made with different sizes and positions
	int theY = 250;
	int theWidth = 250;
	int theHeight = 250;
	
	public CubeCuba(Graphics g){
		g.drawRect(theX, theY, theWidth, theHeight);  //draws a square
		leftSide(g);                                    //calls method leftSide
		topSide(g);                                     //calls method topSide
	}
	
	public void leftSide(Graphics g){    //method adds the left "3Ding" of the cube

		Polygon cubingl = new Polygon();  //creates a new polygon called cubingl
		cubingl.addPoint(theX, theY);       //adds points of polygon cubingl
		cubingl.addPoint(theX-100, theY-100);
		cubingl.addPoint(theX-100, theY+150);
		cubingl.addPoint(theX, theY+250);
		
		g.drawPolygon(cubingl);          //draws polygon cubingl using the inputed points
	}
	
	
	public void topSide(Graphics g){     //method adds the top "3Ding" of the cube
		  Polygon cubingt = new Polygon();  //creates a new polygon called cubingt
		  cubingt.addPoint(theX, theY);       //adds points of polygon cubingt
		  cubingt.addPoint(theX-100, theY-100);
		  cubingt.addPoint(750, theY-100);
		  cubingt.addPoint(theX+250, theY);
		  g.drawPolygon(cubingt);         //draws polygon cubingt using the inputed points
	}
}

 class DotsOfTheDie{
	 	int theX = 600;      //defining the values
		int theY = 250;
		int theWidth = 250;
		int theHeight =250; 
		
		public DotsOfTheDie(Graphics g){
		 g.fillOval(theX+(theWidth/5), theY+(theHeight/5), theWidth/5, theHeight/5);        //creates the dots that will go on the face of the cube
			g.fillOval(theX+3*(theWidth/5), theY+3*(theHeight/5), theWidth/5, theHeight/5);
			g.fillOval(theX+(theWidth/5),  theY+3*(theHeight/5), theWidth/5, theHeight/5);
			g.fillOval(theX+3*(theWidth/5), theY+(theHeight/5), theWidth/5, theHeight/5);
			
			g.fillOval(theX-70, theY+55, theWidth/6, theHeight/5);                              //creates the dot on the side
			
			g.fillOval(theX, theY-85, theWidth/5, theHeight/6);
			g.fillOval(theX+100, theY-60, theWidth/5, theHeight/6);
		}
 }
 
class Diieee extends CubeCuba{
		private DotsOfTheDie onIt;
		
		public Diieee(Graphics g){
			super(g);
		onIt = new DotsOfTheDie(g);
		}
	}
