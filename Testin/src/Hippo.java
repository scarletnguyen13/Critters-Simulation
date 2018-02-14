import java.awt.*;
import java.util.Random;

public class Hippo extends Critter {
	
	private Direction[] dir = {Direction.EAST,Direction.SOUTH,Direction.WEST,Direction.NORTH};
	private Random rand = new Random();
	private int remainHunger;
	private Direction currentDir;
	private int moveCount;
	
	public Hippo(int hunger) {
		this.remainHunger = hunger;
		moveCount = 0;
		currentDir = dir[rand.nextInt(4)];
	}
	
	public boolean eat() {
		if (remainHunger > 0) {
			remainHunger--;
			return true;
		}
		return false;
	}
	
	public Color getColor() {
		if (eat()) { return Color.GRAY; }
		return Color.WHITE;
	}
	
	public Attack fight(String opponent) {
		if (eat()) { return Attack.SCRATCH; }
		return Attack.POUNCE;
	}

	public Direction getMove() {
		if (moveCount % 5 == 0) {
			Direction temp = dir[rand.nextInt(4)];
			while (temp.equals(currentDir)) { temp = dir[rand.nextInt(4)]; }
			currentDir = temp;
		}
		moveCount++;
		return currentDir;
	}

	public String toString() { return "" + remainHunger; }
} 