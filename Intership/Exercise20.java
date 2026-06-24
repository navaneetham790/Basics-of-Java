package Intership;
public class Exercise20 {
	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo();
		Faculty f1 = new Faculty();
		s1.showPerson();
		s1.showStudentInfo();
		System.out.println();
		f1.showPerson();
		f1.showFaculty();
	}
}
class Person {
	void showPerson() {
		System.out.println("This is Person Class");
	}
}
class StudentInfo extends Person {
	void showStudentInfo() {
		System.out.println("This is Student Class");
	}
}
class Faculty extends Person {
	void showFaculty() {
		System.out.println("This is Faculty Class");
	}
}
