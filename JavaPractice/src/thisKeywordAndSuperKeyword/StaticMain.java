package thisKeywordAndSuperKeyword;

public class StaticMain {

	public static void main(String[] args) {
		System.out.println(StaticKeyword.a);
		StaticKeyword.m1();
		
		StaticKeyword sk = new StaticKeyword();
		//int b = sk.b;
		System.out.println(sk.b);
		sk.m2();
	}

}
