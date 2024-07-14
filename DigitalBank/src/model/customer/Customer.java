package model.customer;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private int id;
	private String name;
	private String email;
	private String phoneNumber;
	private String birthDay;

	private static Set<Integer> usedIds = new HashSet<>();

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;

		if (!usedIds.add(this.id)) {
			throw new IllegalArgumentException("ID already exists: " + this.id);
		}
	}

	public Customer(int id, String name, String email, String phoneNumber, String birthDay) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.birthDay = birthDay;

		if (!usedIds.add(this.id)) {
			throw new IllegalArgumentException("ID already exists: " + this.id);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return String.format("ID: %d\nName: %s\n------", this.id, this.name);
	}
}
