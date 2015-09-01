import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;


public class FinalCube extends Applet{
	public void paint(Graphics g){
	
	setBackground(Color.cyan);
	//int width=getSize().width;
    //int height=getSize().height;
    //this.setSize(new Dimension(width,height));

	Diieee die = new Diieee(g, 200, 100);         //creates new Diieee
	Diieee leftCube = new Diieee(g, 600, 250);
	Diieee lowCube = new Diieee(g, 1000, 500);
	}
}

class CubeCuba{
	static int theX;       //declares variables that would help new cubes to be made with different sizes and positions
	static int theY;
	int theWidth = 250;
	int theHeight = 250;
	
	public CubeCuba(Graphics g, int theX, int theY){
		squareFace(g, theX, theY);                                  //calls method squareFace for main cube ( the die)
		leftSide(g, theX, theY);                                    //calls method leftSide for main cube (the die)
		topSide(g, theX, theY);                                     //calls method topSide for the main cube  (the die)
		
		
		//squareFace(g, 200, 100);                                   //calls method for squareFace on the upper left
		//leftSide(g, 200, 100);                                     //calls method for leftSide on the upper left
		//topSide(g, 200, 100);                                      //calls method for topSide on the upper left
	}
	
	public void squareFace(Graphics g, int theX, int theY){
		g.drawRect(theX, theY, theWidth, theHeight);  //draws a square
	}
	
	public void leftSide(Graphics g, int theX, int theY){    //method adds the left "3Ding" of the cube

		Polygon cubingl = new Polygon();  //creates a new polygon called cubingl
		cubingl.addPoint(theX, theY);       //adds points of polygon cubingl
		cubingl.addPoint(theX-100, theY-100);
		cubingl.addPoint(theX-100, theY+150);
		cubingl.addPoint(theX, theY+250);
		
		g.drawPolygon(cubingl);          //draws polygon cubingl using the inputed points
	}
	
	
	public void topSide(Graphics g, int theX, int theY){     //method adds the top "3Ding" of the cube
		  Polygon cubingt = new Polygon();  //creates a new polygon called cubingt
		  cubingt.addPoint(theX, theY);       //adds points of polygon cubingt
		  cubingt.addPoint(theX-100, theY-100);
		  cubingt.addPoint(theX+150, theY-100);
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
		 DotsOfTheDie onIt;
		
		public Diieee(Graphics g, int theX, int theY){
			super(g, theX, theY);
		onIt = new DotsOfTheDie(g);
		}
	}
