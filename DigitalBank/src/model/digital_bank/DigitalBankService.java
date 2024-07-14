package model.digital_bank;

import javax.security.auth.login.AccountNotFoundException;

import model.account.AccountType;
import model.account.BankAccount;
import model.account.BankAccountService;
import model.exception.AccountAlreadyExistsException;

public class DigitalBankService {

	private DigitalBank digitalBank;

	private BankAccountService bankAccountService;

	public DigitalBankService() {
		digitalBank = null;
		bankAccountService = new BankAccountService();
	}

	public void createDigitalBank(int companyRegistrationNumber, String name) {
		if (this.digitalBank == null)
			this.digitalBank = DigitalBankFactory.createDigitalBank(companyRegistrationNumber, name);
	}

	public void createBankAccount(int id, String name, AccountType type) throws AccountAlreadyExistsException {
		if (digitalBank
				.getBankAccountList().stream().filter(acc -> acc.getCustomer().getId() == id
						&& acc.getCustomer().getName().equalsIgnoreCase(name) && acc.getType().equals(type))
				.count() > 0)
			throw new AccountAlreadyExistsException("This bank account already exists");

		BankAccount bankAccount = bankAccountService.createBankAccount(id, name, type);

		if (bankAccount != null) {
			digitalBank.addBankAccount(bankAccount);
		}
	}

	public void removeBankAccount(int accountNumber) {
		digitalBank.getBankAccountList().forEach(acc -> {
			if (acc.getNumber() == accountNumber) {
				digitalBank.removeBankAccount(acc);
				return;
			}
		});
	}

	public void withdraw(int accountNumber, double withdrawAmount) {
		digitalBank.getBankAccountList().forEach(acc -> {
			if (acc.getNumber() == accountNumber) {
				bankAccountService.withdraw(acc, withdrawAmount);
				return;
			}
		});
	}

	public void deposit(int accountNumber, double depositAmount) {
		digitalBank.getBankAccountList().forEach(acc -> {
			if (acc.getNumber() == accountNumber) {
				acc.deposit(depositAmount);
				return;
			}
		});
		;
	}

	public void transfer(int originAccountNumber, int targetAccountNumber, double transferAmount)
			throws AccountNotFoundException {
		final BankAccount[] origin = { null };
		final BankAccount[] target = { null };

		digitalBank.getBankAccountList().forEach(acc -> {
			if (acc.getNumber() == originAccountNumber) {
				origin[0] = acc;
			}
			if (acc.getNumber() == targetAccountNumber)
				target[0] = acc;
		});

		if (origin[0] != null && target[0] != null) {
			bankAccountService.transfer(origin[0], target[0], transferAmount);
		} else {
			if (origin[0] == null)
				throw new AccountNotFoundException("Origin account not found");

			if (target[0] == null)
				throw new AccountNotFoundException("Target account not found");
		}

	}

	public void getAllBankCustomers() {
		System.out.println("=== Bank Customers List ===");
		digitalBank.getBankAccountList().forEach(acc -> System.out.println(acc.getCustomer()));
	}

	public void getBankAccountList() {
		System.out.println("=== Bank Account List ===");
		digitalBank.getBankAccountList().forEach(acc -> System.out.println(acc));
	}
}
