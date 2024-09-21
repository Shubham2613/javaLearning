package methodsAndConstructors;

public class Student {
	int sid;
	String sname;
	char grade;
	
	public void printStudentData() {
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	public void setStudentData(int id,String name,char gr) {
		sid=id;
		sname=name;
		grade=gr;
	}
	
	Student(int id,String name,char gr){
		sid=id;
		sname=name;
		grade=gr;
	}
}
