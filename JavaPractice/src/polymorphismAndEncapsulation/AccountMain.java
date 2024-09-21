package polymorphismAndEncapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setAccno(102);
		System.out.println(acc.getAccno());
		
		acc.setName("Shubham");
		System.out.println(acc.getName());

		
	}

}
