import java.awt.Graphics;


class SingleDie extends CubeCuba{
	private DotsOfTheDie onIt;
	
	public SingleDie(Graphics g){
		super(g);
	onIt = new DotsOfTheDie(g);
	}
}
