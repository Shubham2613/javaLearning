package methodOverriding;


class ABC 
{
	public void m1(int a) {
		System.out.println(a);
	}
	public void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	public void m1(int a) {		//Overriding m1
		System.out.println(a*a);
	}
	public void m2(int a, int b) { //Overloading m2
		System.out.println(a+b);
	}
}
public class MethodOverridingVSmethodOverloading {

	public static void main(String[] args) {
		
		XYZ xyzObj = new XYZ();
		xyzObj.m1(2);
		xyzObj.m2(15);
		xyzObj.m2(5, 2);
	}

}
