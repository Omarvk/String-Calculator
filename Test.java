public class test{
	
	public static void main(String[] args) {
		calcus ca = new calcus();
		StdOut.println(ca.add(""));
		StdOut.println(ca.add("1"));
		StdOut.println(ca.add("1,2"));
		StdOut.println(ca.add("1\\n2,3"));
		StdOut.println(ca.add("//;\\n1;2"));
		StdOut.println(ca.add("-1,2"));
		StdOut.println(ca.add("2,-4,3,-5"));

	}
}