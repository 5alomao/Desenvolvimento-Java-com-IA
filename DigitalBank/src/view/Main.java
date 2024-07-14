package view;

import model.account.AccountType;
import model.digital_bank.DigitalBankService;

public class Main {

	public static void main(String[] args) {

		try {
			DigitalBankService dbs = new DigitalBankService();
			dbs.createDigitalBank(999, "JBank");

			dbs.createBankAccount(12345, "Customer 01", AccountType.CHECKING);
			dbs.createBankAccount(54321, "Customer 02", AccountType.SAVINGS);

			dbs.deposit(1, 1500);

			dbs.withdraw(1, 500);

			dbs.transfer(1, 2, 500);

			dbs.getBankAccountList();

		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
