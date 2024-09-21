package interfaces;

public class Circle implements Shape {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.colorShape();
	}

	@Override
	public void drawShape() {
		System.out.println("drawCircle");
	}

	@Override
	public void colorShape() {
		System.out.println("colorCircle");
		
	}
}
