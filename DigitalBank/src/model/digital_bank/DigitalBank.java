package model.digital_bank;

import java.util.ArrayList;
import java.util.List;

import model.account.BankAccount;

public class DigitalBank implements IDigitalBank {

	private int companyRegistrationNumber;
	private String name;
	private String supportEmail;
	private String supportPhone;
	private List<BankAccount> bankAccountList;

	public DigitalBank(int companyRegistrationNumber, String name) {
		this.companyRegistrationNumber = companyRegistrationNumber;
		this.name = name;
		bankAccountList = new ArrayList<>();
	}

	public DigitalBank(int companyRegistrationNumber, String name, String supportEmail, String supportPhone) {
		this.companyRegistrationNumber = companyRegistrationNumber;
		this.name = name;
		this.supportEmail = supportEmail;
		this.supportPhone = supportPhone;
	}

	@Override
	public void addBankAccount(BankAccount bankAccount) {
		if (bankAccount == null) {
			throw new IllegalArgumentException("Bank account cannot be null");
		}

		bankAccountList.add(bankAccount);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		bankAccountList.remove(bankAccount);
	}

	public int getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	public String getName() {
		return name;
	}

	public String getSupportEmail() {
		return supportEmail;
	}

	public String getSupportPhone() {
		return supportPhone;
	}

	public List<BankAccount> getBankAccountList() {
		List<BankAccount> list = new ArrayList<>(bankAccountList);
		return list;
	}

}
