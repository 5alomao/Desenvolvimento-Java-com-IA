package model.digital_bank;

import model.account.BankAccount;

public interface IDigitalBank {

	void addBankAccount(BankAccount bankAccount);

	void removeBankAccount(BankAccount bankAccount);

}
