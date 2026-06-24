package Intership;
import java.util.Scanner;
public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Basic Salary:");
		double basicsalary=sc.nextDouble();
		double hra= basicsalary*0.20;
		double da= basicsalary*0.10;
		double tax= basicsalary*0.05;	
		System.out.println("Salary Slip");
		System.out.println("HRA: "+hra);
		System.out.println("DA :"+da);
		System.out.println("TAX :"+tax);
	}
}
