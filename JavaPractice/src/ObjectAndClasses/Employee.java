package ObjectAndClasses;

public class Employee {
	
	//variables
	int empId;
	String name;
	int salary;
	
	//Method 
	public void display() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId = 101;
		emp1.name = "Shubham";
		emp1.salary = 10000;
		emp1.display();
		
	}

}
