import java.awt.Color;

public class Cougar extends Critter {
	
	private boolean west;
	private boolean fought;
	
	public Cougar() {
		west = true;
		fought = false;
	}
	
	public boolean eat() {
		west = !west;
		return true;
	}
	
	public Attack fight(String opponent) {
		fought = true;
		return Attack.POUNCE;
	}
	
	public Color getColor() {
		if (fought) {
			return Color.RED;
		} else {
			return Color.BLUE;
		}
	}
	
	public Direction getMove() {
		if (west) {
			return Direction.WEST;
		} else {
			return Direction.EAST;
		}
	}
	
	public String toString() {
		return "C";
	}
}
