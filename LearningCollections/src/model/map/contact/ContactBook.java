package model.map.contact;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

	private Map<String, Integer> contacts;

	public ContactBook() {
		contacts = new HashMap<>();
	}

	public void addContact(String name, Integer phoneNumber) {
		contacts.put(name, phoneNumber);
	}

	public void removeContact(String name) {
		if (!contacts.isEmpty()) {
			if (contacts.containsKey(name))
				contacts.remove(name);
		}
	}

	public void displayContacts() {
		System.out.println(contacts);
	}

	public Integer findContactByName(String name) {

		if (!contacts.isEmpty()) {
			if (contacts.containsKey(name))
				return contacts.get(name);
		}

		return null;
	}
}
