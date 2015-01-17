import java.util.Random;
import java.util.Scanner;

public class bonus1 {

	public static void main(String args[]) {
		int i = 1, j = 0, s = 0;
		Random rand = new Random();
		System.out.println("enter players");
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int sum[] = new int[10];
		int status[] = new int[10];
		int r1 = 0, r2 = 0, r3 =0,r4 = 0;
		while (j == 0) {
			for (i = 0; i < p; i++) {
				s = 0;
				r1 = rand.nextInt(6) + 1;
				r2 = rand.nextInt(6) + 1;
				r3 = rand.nextInt(6) + 1;
				System.out.print("p" + (i + 1) + "\t" + r1 + "\t" + r2);
				if (r1 == 6 || r2 == 6) {
					status[i] = 1;
					
				}
				if (status[i] == 1) {
					s = r1 + r2;
					sum[i] += s;
					System.out.print("\t" + sum[i]);
				}
				System.out.print("\n");
				if(r1==6 || r2 ==6)
				{
					System.out.print("PLAYER" + (i + 1) + "\t" + r3 + "\t" + r4 );
					sum[i] += r3;
					System.out.print("\t" + sum[i]+"\n");
					
				}
				
				if (sum[i] > 100) {
					System.out.print("\np" + (i + 1)
							+ "  is the winner with sum   " + sum[i]);
					j = 1;
					return;
					// break;

				}

			}
		}

	}
}
