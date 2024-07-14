package model.account;

public interface IBankAccount {

	void withdraw(double withdrawAmount);

	void deposit(double depositAmount);

	void transfer(double transferAmount, BankAccount destinationAccount);

	String getBankStatement();

}
