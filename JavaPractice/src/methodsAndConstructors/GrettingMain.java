package methodsAndConstructors;

public class GrettingMain {

	public static void main(String[] args) {
		Gretting gt = new Gretting();
		gt.m1();
		
		String s = gt.m2();
		System.out.println(s);
		
		gt.m3("Shubh");
		
		String var = gt.m4("Shubham ");
		System.out.println(var);

	}

}
