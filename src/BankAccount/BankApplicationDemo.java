package BankAccount;

import java.util.List;
import java.util.Scanner;

public class BankApplicationDemo {

	static void showmenu(BankAccount bankAccount) {
		System.out.println("Welcome Account Number: " + bankAccount.getaccountNumber() + " \nAccount Type "
				+ bankAccount.getType());
		boolean flag = true;
		while (flag) {
			System.out.println("Please Select an option below: ");
			System.out.println("Press 1 to Deposit Amount.");
			System.out.println("Press 2 to Withdraw Amount.");
			System.out.println("Press 3 to TransactionHistory");
			System.out.println("Press 4 to Get Mini Statement");
			System.out.println("Press 5 to Get Minimum Balance");
			System.out.println("Press 6 to Get Current Balance");
			System.out.println("Press 7 to Get Interest Rate");
			System.out.println("Press 8 key Cancel & Exit");
			System.out.println(" ");

			try {
				Scanner scanner = new Scanner(System.in);
				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Please Enter the amount to be deposited: ");
					double depamt = scanner.nextDouble();
					bankAccount.deposit(depamt);

					break;
				case 2:
					System.out.println("Please Enter the amount to withdraw:");
					double withamt = scanner.nextDouble();
					bankAccount.withdraw(withamt);
					break;
				case 3:
					System.out.println("Transaction History:");
					List<Transaction> list = bankAccount.getTransactionHistory();
					list.stream().forEach(
							i -> System.out.println(i.getTransactionId() + " " + i.getType() + " " + i.getAmount()));
					break;
				case 4:
					System.out.println("Mini Statement");
					List<Transaction> miniStmt = bankAccount.getMiniStatement();
					miniStmt.stream().forEach(
							i -> System.out.println(i.getTransactionId() + " " + i.getType() + " " + i.getAmount()));
					break;
				case 5:
					System.out.println("Minimum Balance");
					System.out.println(bankAccount.getMinimumBalance());
					break;
				case 6:
					System.out.println("Your Account Balance is " + bankAccount.getCurrentBalance() + " Rupees");
					System.out.println(" ");
					break;
				case 7:
					System.out.println("Interest Rate: is" + bankAccount.getInterestRate());
					break;

				default:
					System.out.println("Transaction Ended");
					flag = false;
					break;
				}
			} catch (Exception e) {
				System.out.println(e);

				System.out.println("------------------------Try Again-----------------------------");
			}

		}
	}

	public static void main(String args[]) {

		HeadOffice headOffice = new HeadOffice();
		// Creating Branches using headoffice
		headOffice.createBranch("B0");

		headOffice.createBranch("B1");

		// Creating Customer
		Customer c1 = new Customer();
		c1.setPanNumber("LKJH651V");

		Branch b1 = headOffice.getBranchById("1");

		b1.createBankAccount("LKJH651V", "Saving", 10000.0); // created a Savings Account in Branch 1

		try {
			BankAccount savingsAcno = b1.getAccountByAccountNumber("1");
			// Getting BankAccount using bank accno:1

			// showmenu(savingsAcno); //to test for savings account uncomment this
		} catch (AccountNotFoundException e) {

			e.printStackTrace();
		}

		b1.createBankAccount("ABCDEFG", "Current", 10000.0); // created a Current Account in Branch 1

		try {

			BankAccount currAcno = b1.getAccountByAccountNumber("2");// Getting BankAccount using bank accno:2
			showmenu(currAcno);// to test the bank menu for current account
		}

		catch (AccountNotFoundException e) {

			e.printStackTrace();
		}

	}
}