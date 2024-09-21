package abstraction;

public class Circle extends Shape{

	public static void main(String[] args) {
		Circle c = new Circle();
		c.colorShape();
		
	}

	@Override
	public void drawShape() {
		System.out.println("drawShape");
		
	}

	@Override
	public void colorShape() {
		System.out.println("colorShape");
	}

	@Override
	public void moveShape() {
		System.out.println("moveShape");
		
	}

}
