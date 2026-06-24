package Intership;
public class Exercise11 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.studentId=101;
		s1.studentName="Navaneetha";
		s1.department="AD";
		Student s2=new Student();
		s2.studentId=102;
		s2.studentName="Priya";
		s2.department="AD";
		Student s3=new Student();
		s3.studentId=103;
		s3.studentName="Bavana";
		s3.department="IT";
		s1.display();
		s2.display();
		s3.display();
	}
}
class Student{
	int studentId;
	String studentName;
	String department;
	void display() {
		System.out.println("Student ID   : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Department   : " + department);
		System.out.println();
	}
}
