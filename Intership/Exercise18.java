package Intership;
public class Exercise18 {
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.setId(101);
		s1.setName("Navaneetha");
		System.out.println("Student ID   : " + s1.getId());
		System.out.println("Student Name : " + s1.getName());
	}
}
class Students{
	private int id;
	private String name;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}