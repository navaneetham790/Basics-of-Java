package Intership;
public class Exercise15 {
	public static void main(String[] args) {
		Demo d1= new Demo();
		Demo d2= new Demo(100);
		Demo d3= new Demo(100,"Java");
	}
}
class Demo{
	Demo(){
		System.out.println("Default Constructor");
	}
	Demo(int a){
		System.out.println("Single Parameter Constructor: " +a);
	}
	Demo(int a,String b){
		System.out.println("Multiple Parameter Constructor: "+a+"  "+b);
	}
}

