public class palindrome {

	public static void main(String args[]) {
		StringBuffer a = new StringBuffer("asd dad dsa");
		System.out.println(a);
		String c = a.toString();

		StringBuffer b = a.reverse();
		String d = b.toString();

		if (c.compareTo(d) == 0) {
			System.out.println("yes");
		} else
			System.out.println("no");
		
	}
}
