package model.set.contact;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {

	private Set<Contact> contacts;

	public ContactBook() {
		contacts = new HashSet<>();
	}

	public void addBook(String name, int phoneNumber) {
		contacts.add(new Contact(name, phoneNumber));
	}

	public void displayContacts() {
		System.out.println(contacts);
	}

	public Set<Contact> searchByName(String name) {
		Set<Contact> foundContacts = new HashSet<>();

		if (!contacts.isEmpty()) {
			for (Contact contact : contacts) {
				if (contact.getName().startsWith(name))
					foundContacts.add(contact);
			}
		}

		return foundContacts;
	}

	public Contact updateContactName(int phoneNumber, String newName) {
		Contact updatedContact = null;

		for (Contact contact : contacts) {
			if (contact.getPhoneNumber() == phoneNumber) {
				contact.setName(newName);
				updatedContact = contact;
				break;
			}
		}

		return updatedContact;
	}
}
