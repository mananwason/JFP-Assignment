import java.util.Scanner;

public class Player {

	String name;
	int score;
	static int d;
	Dice d1, d2;
	static int a, b, c = 0;
	int f = 0 ;

	public Player(String n) {
		this.name = n;
		this.score = 0;
		this.d1 = new Dice();
		this.d2 = new Dice();
	}

	public static void rollTwice() {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		a = Dice.roll();
		b = Dice.roll();
		Player.d = a + b;
		
		
		 
	}
}