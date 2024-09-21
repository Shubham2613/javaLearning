package methodsAndConstructors;

public class Constructor {
	int x,y;
	
	Constructor(){	//Default Constructor
		x=10;
		y=10;
	}
	
	Constructor(int id,String name){ 	//Parameterized Constructor
		System.out.println(id+name);
	}
	
	void sum() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		
		Constructor ct = new Constructor(101,"Shubh");
		//ct.sum();
	}

}
