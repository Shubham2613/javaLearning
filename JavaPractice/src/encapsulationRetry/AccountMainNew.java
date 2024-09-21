package encapsulationRetry;

public class AccountMainNew {
	
	public static void main(String args[]) {
		Account acc = new Account();
		
		acc.setAccountNo(101);
		acc.setAmount(10000);
		acc.setName("Shubham Barje");
		
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		
		
		
		
		
	}
}
