package methodsAndConstructors;

public class StudentMain {

	public static void main(String[] args) {
		
//		1)Using object referance variable
//		Student stu = new Student();
//		stu.sid=101;
//		stu.sname="Shubham";
//		stu.grade='A';
		
//		2)using Method
		//stu.setStudentData(101, "Shubh", 'A');
//		stud.printStudentData();
		
		
//		3)Using Constructor
		Student stud =  new Student(101,"Shubh",'A');
		stud.printStudentData();
		

		

	}

}
