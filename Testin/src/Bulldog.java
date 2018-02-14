import java.awt.*;
import java.util.Random;

public class Bulldog extends Critter{
	
	//TODO: CREATE UNIQUE AND INTESTING BEHAVIOURS
	//BEHAVIOR 1: CAMOUFLAGE
	//BEHAVIOR 2: KNOW THE OPPONENT'S TYPES OF DEFEND?
	
	//TODO: HOW TO DEFEAT/AVOID STONES????
	
	Random rand = new Random();
	Direction[] direction = {Direction.WEST,Direction.EAST,Direction.NORTH,Direction.SOUTH};
	
	//Constructor
	public Bulldog() {}
	
	//HOW TO RECOGNIZE OTHER'S FIGHTING BEHAVIOR?
	public Attack fight(String opponent) {
		if (opponent.equals("%")) { return Attack.ROAR; }
		return Attack.SCRATCH;
	}
	
	public boolean eat() { return true; } //EAT MAKE THE ANIMAL SLEEP - HOW TO SOLVE?
	
	public Direction getMove() { return direction[rand.nextInt(4)]; }
	
	public String toString() { 
		//return getNeighbor(direction[rand.nextInt(4)]); 
		return "|";
	}
}