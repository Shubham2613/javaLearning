package methodsAndConstructors;

public class Gretting {
	//1)No parameter   No return type
	public void m1() {
		System.out.println("Hello...");
	}
	
	//2)No parameter   Return value
	public String m2() {
		return "Hello..return type";
	}
	
	//3)Take parameter  No return Type
	public void m3(String name) {
		System.out.println("Hello"+name);
	}
	
	//4)Take Parameter returns value
	public String m4(String name) {
		return "Hello" + name;
	}
}
