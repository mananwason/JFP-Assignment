import java.util.Random;

public class Dice {

	public static int roll() {
		Random rand = new Random();
		int r1 = 0;
		r1 = rand.nextInt(6) + 1;
		return r1;
	}
}
