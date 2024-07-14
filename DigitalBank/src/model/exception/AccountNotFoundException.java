package model.exception;

public class AccountNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 29447212436070263L;

	public AccountNotFoundException(String message) {
		super(message);
	}

}
