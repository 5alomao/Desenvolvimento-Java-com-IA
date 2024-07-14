package model.account;

import model.customer.Customer;

public abstract class BankAccount implements IBankAccount {

	private static int DEFAULT_AGENCY = 0001;
	private static int SEQUENTIAL_ACCOUNT_NUMBER = 1;

	protected int agency;
	protected int number;
	protected AccountType type;
	protected double balance;
	protected Customer customer;

	public BankAccount(Customer customer) {
		this.agency = DEFAULT_AGENCY;
		this.number = SEQUENTIAL_ACCOUNT_NUMBER++;
		this.customer = customer;
	}

	@Override
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > this.balance)
			throw new IllegalArgumentException("Insufficient balance to withdraw");
		this.balance -= withdrawAmount;
	}

	@Override
	public void deposit(double depositAmount) {
		if (depositAmount <= 0)
			throw new IllegalArgumentException("Deposit amount cannot be negative or zero");
		this.balance += depositAmount;
	}

	@Override
	public void transfer(double transferAmount, BankAccount destinationAccount) {
		this.withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);
	}

	protected String buildBankStatement() {
		return String.format(
				"=== Bank Statement ===\nAgency: %d\nNumber: %d\nAccountType: %s\nCustomer: %s\nBalance: %.2f\n",
				this.agency, this.number, this.type, this.customer.getName(), this.balance);
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public AccountType getType() {
		return type;
	}

	@Override
	public String toString() {
		return String.format("Agency: %d\nNumber: %d\nAccountType: %s\nCustomer: %s\nBalance: %.2f\n-------",
				this.agency, this.number, this.type, this.customer.getName(), this.balance);
	}

}
