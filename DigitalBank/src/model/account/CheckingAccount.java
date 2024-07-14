package model.account;

import model.customer.Customer;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(Customer customer) {
		super(customer);
		super.type = AccountType.CHECKING;
	}

	@Override
	public String getBankStatement() {
		return buildBankStatement();
	}
}
