import java.awt.*;

public class Bird extends Critter {
	
	private Direction[] dir = {Direction.NORTH,Direction.NORTH,Direction.NORTH,
							   Direction.EAST,Direction.EAST,Direction.EAST,
							   Direction.SOUTH,Direction.SOUTH,Direction.SOUTH,
							   Direction.WEST,Direction.WEST,Direction.WEST};
	private int count;
	
	public Bird() { count = 0; }
	
	public Color getColor() { return Color.BLUE; }
	
	public Attack fight(String opponent) {
		if (opponent.equals("%")) { return Attack.ROAR; }
		return Attack.POUNCE;
	}
	
	public Direction getMove() {
		if (count == 12) { count = 0; } //Restart count
		count++;
		return dir[count-1];
	}
	
	public String toString() {
		if 		(count >= 0 && count <= 3) { return "^"; } 
		else if (count >= 3 && count <= 6) { return ">"; } 
		else if (count >= 6 && count <= 9) { return "V"; } 
		else {								 return "<"; }
	}
}