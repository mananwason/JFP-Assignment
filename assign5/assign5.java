import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class assign5 {
public static void main(String args[]){
	HashMap hm = new HashMap();
	Random rand = new Random();
	int r1 = rand.nextInt(6)+1;
	int r2 = rand.nextInt(6) + 1;
	
	hm.put( new Integer(2),"hard luck");
	hm.put( new Integer(3),"better");
	hm.put( new Integer(4),"oh no");
	hm.put( new Integer(5),"hmm");
	hm.put( new Integer(6),"yes good");
	hm.put( new Integer(7),"wow");
	hm.put( new Integer(8),"hurray");
	hm.put( new Integer(9),"yes that more like it");
	hm.put( new Integer(10),"awesome");
	hm.put( new Integer(11),"yep !! really good");
	hm.put( new Integer(12),"cool !! awesome");
	 
	int r = r1+r2;
	System.out.print(r1+"+"+r2+"\t"+r+"\t");
	System.out.println( hm.get(r));
	
}

public String toString() {
	return "my assign5 ";
}
 
}
