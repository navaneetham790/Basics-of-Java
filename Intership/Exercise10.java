package Intership;
public class Exercise10 {
	public static void main(String[] args) {
		int F1=225;
		int F2=300;
		System.out.println("Using Temp");
		int temp=F1;
		F1=F2;
		F2=temp;
		System.out.println("F1:"+F1);
		System.out.println("F2:"+F2);
		System.out.println(" Without Using Temp");
		F1=F1+F2;
		F2=F1-F2;
		F1=F1-F2;
		System.out.println("F1:"+F1);
		System.out.println("F2:"+F2);
	}
}