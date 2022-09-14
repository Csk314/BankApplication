package BankAccount;

public class Transaction {
	private String transactionId;
	private double amount;
	private String type;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setType(String type) { // deposit or withdraw (Not savings or curr)
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
