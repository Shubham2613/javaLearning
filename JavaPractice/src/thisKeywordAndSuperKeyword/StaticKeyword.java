package thisKeywordAndSuperKeyword;

public class StaticKeyword {
	static int a = 10;
	int b = 20;
	
	public static void m1() {
		System.out.print("this is static method");
	}
	
	public void m2() {
		System.out.print("this is non-static method");
	}
	
//	public static void main(String[] args) {
//		//Static methods can access static stuff directly(without creating object)
//		System.out.println(a);
//		m1();
		
		//can not access b directly we have to create object because b is non-static	 
//		System.out.println(b);
//		m2();
	}

//}
