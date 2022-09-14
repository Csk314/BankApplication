package BankAccount;

public class CurrentAccount extends BankAccount {

	double minimumBalance = 20000.0;
	double interestRate = 0.0;

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Current";
	}

	@Override
	public double getMinimumBalance() {
		// TODO Auto-generated method stub
		return minimumBalance;

	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;

	}
}
