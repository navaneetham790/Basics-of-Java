package Intership;
public class Exercise12 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId = 101;
		e.empName = "Navaneetha";
		e.salary = 45000;
		e.display();
	}
}
class Employee {
	int empId;
	String empName;
	double salary;
	void display() {
		System.out.println("Employee ID   : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Salary        : " + salary);
	}
}