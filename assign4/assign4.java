import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class assign4 {
		public static void main(String args[]) {
			int i = 1, j = 0, s = 0;
			int high = 0;
			Random rand = new Random();
			Scanner scan = new Scanner(System.in);
			int p= scan.nextInt();
			int sum[] = new int[10];
			int status[] = new int[10];
			int r1 = 0, r2 = 0, x =0;
			while ( x<10) {
				for (i = 0; i < p; i++) {
					s = 0;
					r1 = rand.nextInt(6) + 1;
					r2 = rand.nextInt(6) + 1;
					//System.out.println("game number" +( x+1)+ " \t");
					//System.out.print("p" + (i + 1) + "\t" + r1 + "\t" + r2);
					if (r1 == 6 || r2 == 6) {
						status[i] = 1;
					}
					if (status[i] == 1) {
						s = r1 + r2;
						sum[i] += s;
						//System.out.print("\t" + sum[i]);
					}
					System.out.print("\n");
					for (i = 1; i < p; i++) {
					if (sum[i] > sum[i-1]) {
						high = sum[i];
						p = i;}
						//return;
						//scan.next(); 
					}}
					
						PrintWriter p1;{
							try {
								p1 = new PrintWriter("C:/Users/manan/Desktop/output.txt");
								p1.print("\np" + i + "  is the winner with sum   " + high); 
								 p1.close(); 
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch(IOException e){
								 System.out.println("io error");
							}
						 

						// break;
						}
			}
			x++;
		}
	
		}
	

