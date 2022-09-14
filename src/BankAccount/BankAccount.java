package BankAccount;

import java.util.List;

public abstract class BankAccount {
	private String accountNumber;
	private double minimumBanlance;
	private double currentBalance;
	private double interestRate;
	private List<Transaction> transactions;

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setcurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public void withdraw(double amount) {

	}

	public void deposit(double amount) {

	}

	public List<Transaction> getTransactionHistory() {
		return transactions;
	}

	public void getMiniStatement() {

	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public String getaccountNumber() {
		return accountNumber;
	}

	public abstract double getMinimumBalance();

	public abstract double getInterestRate();

	public abstract String getType();

}
