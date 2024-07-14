package model.account;

import model.customer.Customer;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(Customer customer) {
		super(customer);
		super.type = AccountType.SAVINGS;
	}

	@Override
	public String getBankStatement() {
		return buildBankStatement();
	}

}
