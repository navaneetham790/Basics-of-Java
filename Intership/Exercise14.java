package Intership;
public class Exercise14 {
	public static void main(String[] args) {
		Book b1=new Book(101,"JavaProgramming");
		b1.display();
	}
}
class Book{
	int bookId;
	String bookName;
	Book(int id,String name){
		bookId=id;
		bookName=name;
	}
	void display() {
		System.out.println("Book ID   : " + bookId);
		System.out.println("Book Name : " + bookName);
	}
}
