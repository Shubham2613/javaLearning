package methodOverriding;

class Test{
	final int x = 10;
}

final class Test2{
	public final void m1() {
		System.out.println("m1");
	}
}
 
//class Test3 extends Test2{
//	public void m1() {
//		System.out.println("m1 of Test3");
//
//	}
//}
public class FinalKeyword {
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t.x);
//		t.x = 100;
		System.out.println(t.x);
		//Test3 test3 = new Test3();
		//test3.m1();
		
		
	}

}
