// Stone objects are displayed as S and always stay put.
// They always pick ROAR in a fight.
//
import java.awt.*;

public class Stone extends Critter {
	public Attack fight(String opponent) {
		return Attack.ROAR;    // good ol' ROAR... nothing beats that!
	}

	public Color getColor() {
		return Color.GRAY;     // stones are gray in color
	}

	public String toString() {
		return "St";            // the game displays a stone as an S
	}
}
