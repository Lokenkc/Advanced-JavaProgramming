
interface StudentInfo {
	int id = 10;
	String name = "Loki";
	String faculty = "BSc CSIT";
	String college = "Vedas College";
	int semester = 7;

	void display();
}

public class InterfaceExample implements StudentInfo {

	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Faculty: " + faculty);
		System.out.println("College: " + college);
		System.out.println("Semester: " + semester);
	}

	public static void main(String[] args) {
		InterfaceExample students = new InterfaceExample();
		students.display();
	}
}

