package model.digital_bank;

public class DigitalBankFactory {

	public static DigitalBank createDigitalBank(int companyRegistrationNumber, String name) {
		return new DigitalBank(companyRegistrationNumber, name);
	}
	
}
