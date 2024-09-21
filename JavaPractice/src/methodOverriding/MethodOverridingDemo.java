package methodOverriding;


class Bank
{
	double roi() {
		return 0;
	}
}

class ICICI extends Bank{
	double roi() {
		return 10.5;
	}
}

class SBI extends Bank{
	double roi() {
		return 11.5;
	}
}


public class MethodOverridingDemo {
	public int sum() {
		int x=10;
		int y =10;
		return x+y;
	}
	
	public static void main(String[] args) {
		ICICI icici = new ICICI();
		System.out.println(icici.roi());
	}

}
