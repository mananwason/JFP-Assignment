import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.println("enter number for factorial :");
		int b = a.nextInt();
		System.out.println(fact(b));
	}
	public static int fact(int c)
	{
		if(c == 1 || c == 0)
		{
			return(c);
		}
		else
		{
			return(c*fact(c-1));
		}
		
	}
}
	

