package polymorphismAndEncapsulation;

public class Adder {
	int a=10;
	int b=10;
	
	public void sum() {
		System.out.print(a+b);
	}
	
	public void sum(int x,int y) {
		System.out.println(x+y);
	}
	
	public void sum(int x, double y) {
		System.out.println(x+y);
	}
	
}
