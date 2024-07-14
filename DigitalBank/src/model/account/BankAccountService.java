package model.account;

import model.customer.CustomerFactory;

public class BankAccountService {

	public BankAccount createBankAccount(int id, String name, AccountType type) {

		if (name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}

		return BankAccountFactory.createBankAccount(CustomerFactory.createCustomer(id, name), type);

	}

	public void withdraw(BankAccount account, double withdrawAmount) {
		account.withdraw(withdrawAmount);
	}

	public void transfer(BankAccount origin, BankAccount target, double transferAmount) {
		origin.withdraw(transferAmount);
		target.deposit(transferAmount);
	}

}
