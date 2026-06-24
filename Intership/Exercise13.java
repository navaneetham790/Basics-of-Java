package Intership;
public class Exercise13 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "Toyota";
		c1.model = "Innova";
		c1.price = 250000;
		Car c2 = new Car();
		c2.brand = "Hyundai";
		c2.model = "Creta";
		c2.price = 180000;
		c1.display();
		c2.display();
	}
}
class Car {
	String brand;
	String model;
	double price;
	void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
		System.out.println();
	}
}
