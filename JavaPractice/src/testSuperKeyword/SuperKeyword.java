package testSuperKeyword;


class Animal{
	String color = "white";
	
	public void eat() {
		System.out.println("Eat...");
	}
}

class Dog extends Animal{
	String color = "Black";
	public void displayColor(){
		System.out.println(super.color);
	}
	
	public void eat() {
		super.eat();
		System.out.println("Eatting Bread.......");
		String[] eat = {"apple","bread"};
		System.out.println(eat.length);
 	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.displayColor();
		d.eat();
		
		

	}

}
