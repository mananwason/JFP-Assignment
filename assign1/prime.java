import java.util.Scanner;

public class prime {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int i =2,j;
		System.out.println("2\tyes");
		for (i = 3; i <= a; i++) {

			for (j = 2; j <= (int) Math.sqrt(i) + 1; j++) {

				if (i % j == 0) {
					System.out.println(i +"no");break;
					
				}
			}
			if(j==(int) Math.sqrt(i) + 2)
				{
					System.out.println(i+"\tyes");
				}
				
					
				
			}
		}
		//System.out.println(i + " yes");
		//System.out.println("yes");
	}
