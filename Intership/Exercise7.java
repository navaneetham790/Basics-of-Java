package Intership;
public class Exercise7 {
	public static void main(String[] args) {
		int a=444465;
		byte data1=(byte)a;
		double b= 32656.7434;
		float data2=(float)b;
		long c=646768834;
		int data3=(int)c;
		System.out.println("** NARROWING CONVERSION **");
		System.out.println("Int to Byte Conversion: "+data1);
		System.out.println("Double to Float Conversion: "+data2);
		System.out.println("Long to Int Conversion: "+data3);
	}
}
