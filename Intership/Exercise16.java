package Intership;
public class Exercise16 {
	public static void main(String[] args) {
		Product p1= new Product(101);
		p1.display();
	}
}
class Product{
	int productId;
	Product(int productId ){
		this.productId=productId;
	}
	void display() {
	System.out.println("Product ID: "+productId);
}
}