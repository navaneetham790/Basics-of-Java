package Intership;
public class Exercise17 {
	public static void main(String[] args) {
	BankAccount b1=new BankAccount();
	b1.deposit(5000);
	b1.withdraw(2000);
	b1.checkBalance();
  }
}
class BankAccount{
	private double balance=10000;
	void deposit(double amount) {
		balance=balance+amount;
	}
	void withdraw(double amount) {
		balance = balance - amount;
	}
	void checkBalance() {
		System.out.println("Balance : " + balance);
	}
}
