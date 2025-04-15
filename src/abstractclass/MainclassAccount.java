package abstractclass;

import java.util.Scanner;

abstract class Account {
	long accountNo;

	public Account(long accountNo) {
		this.accountNo = accountNo;

	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public abstract double getBalance();

}

class SavingsAccount extends Account {
	private double interestRate;
	private double balance;

	public SavingsAccount(long accountNo, double interestRate) {
		super(accountNo);
		this.interestRate = interestRate;
		this.balance = 0;

	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override

	public double getBalance() {

		return balance + (balance * interestRate);

	}

	public void deposit(double initialBalance) {
		if (initialBalance > 0) {
			balance += initialBalance;
		}
	}

}

public class MainclassAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");
		long accountNo = Long.parseLong(scanner.nextLine());

		System.out.print("Enter interest rate: ");
		double interestRate = Double.parseDouble(scanner.nextLine());

		System.out.print("Enter balance: ");
		double initialBalance = Double.parseDouble(scanner.nextLine());

		SavingsAccount saviaccout = new SavingsAccount(accountNo, interestRate);
		saviaccout.deposit(initialBalance);
		System.out.println("Savings Account created with account number: " + saviaccout.getAccountNo());
		System.out.println("Interest Rate of savings account: " + saviaccout.getInterestRate());
		System.out.println("Balance in savings account: " + saviaccout.getBalance());
		scanner.close();
	}
}