package Intership;
import java.util.Scanner;
public class Exercise8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Subject Marks");
		System.out.print("S1: ");
		int s1=sc.nextInt();
		System.out.print("S2: ");
		int s2=sc.nextInt();
		System.out.print("S3: ");
		int s3=sc.nextInt();
		System.out.print("S4: ");
		int s4=sc.nextInt();
		System.out.print("S5: ");
		int s5=sc.nextInt();
		int total=s1+s2+s3+s4+s5;
		System.out.println("Total marks for all the subjects: "+total);
		int avg=total/5;
		System.out.println("Average Marks: "+avg);
		double percentage=((double)total/500)*100;
		System.out.println("Percentage: "+percentage);
	}
}