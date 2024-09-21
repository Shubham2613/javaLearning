package thisKeywordAndSuperKeyword;

public class demo {

	int x =10;
	int y =10;
	
	public void add() {
		int x = 20;
		int y = 50;
		System.out.println(x+y);
		System.out.print(this.x+this.y);
		
	}
	public static void main(String[] args) {
		demo d = new demo();
		d.add();

	}

}
