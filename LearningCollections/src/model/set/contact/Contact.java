package model.set.contact;

import java.util.Objects;

public class Contact {

	private String name;
	private int phoneNumber;

	public Contact(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contact))
			return false;
		Contact other = (Contact) obj;
		return phoneNumber == other.phoneNumber;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Phone-Number: " + phoneNumber;
	}
}
