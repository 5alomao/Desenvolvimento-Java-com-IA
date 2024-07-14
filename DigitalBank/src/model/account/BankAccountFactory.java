package model.account;

import model.customer.Customer;

public class BankAccountFactory {

	public static BankAccount createBankAccount(Customer customer, AccountType type) {

		switch (type) {
		case CHECKING: {
			return new CheckingAccount(customer);
		}
		case SAVINGS: {
			return new SavingsAccount(customer);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
