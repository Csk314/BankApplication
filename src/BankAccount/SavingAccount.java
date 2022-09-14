package BankAccount;

public class SavingAccount extends BankAccount {

	double minimumBalance = 10000.0;
	double interestRate = 4.5;

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Saving";
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
