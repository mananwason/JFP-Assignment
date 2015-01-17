import java.util.Random;
import java.util.Scanner;

public class Game {
	Player[] players;

	public static void main(String args[]) {
		int i = 0,flag_winner=0;
		int highest = 0;
		System.out.println("enter number of players");
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		Player[] players = new Player[20];
		for (i = 0; i < p; i++) {
			players[i] = new Player("player" + (i + 1));

		}
		
		while (highest < 100) {
			for (i = 0; i < p; i++) {
				players[i].rollTwice();
				
				if (players[i].a == 6 || players[i].b == 6) {
					players[i].f = 1;

				}
				if ((players[i].f == 1)) {
					players[i].score = players[i].score + players[i].a
							+ players[i].b;
				}
				System.out.print("\np"+(i+1)+"\t"+players[i].a + "\t" + players[i].b + "\t "+ players[i].score+ "\n");
				if (players[i].score > highest) {
					highest = players[i].score;
					flag_winner=i;
				}
				
				}

			
		}System.out.println("\n\nwinner is  p"+( flag_winner +1));
	}
}
