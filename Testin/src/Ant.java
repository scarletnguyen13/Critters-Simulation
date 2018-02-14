import java.awt.*;   // for Color

public class Ant extends Critter {
	
	private boolean south;
	private boolean movedEast;
	
	public Ant(boolean walkSouth) {
		south = walkSouth;
		movedEast = false;
	}
	
	public boolean eat() { return true; }
	
	public Attack fight(String opponent) { return Attack.SCRATCH; }    
	
	public Color getColor() { return Color.RED; }
	
	public Direction getMove() {
		if (!movedEast) {
			movedEast = true;
			if (south) { return Direction.SOUTH; } 
			else {       return Direction.NORTH; }
		} else {
			movedEast = false;
			return Direction.EAST;
		}
	}
	
	public String toString() { return "%"; }
}