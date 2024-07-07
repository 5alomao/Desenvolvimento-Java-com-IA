package model.set.guest;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

	private Set<Guest> guests;

	public GuestSet() {
		this.guests = new HashSet<>();
	}

	public void addGuest(String name, int invitationCode) {
		guests.add(new Guest(name, invitationCode));
	}

	public void removeGuestByInvitationCode(int invitationCode) {
		Guest guestFromRemove = null;
		for (Guest guest : guests) {
			if (invitationCode == guest.getInvitationCode()) {
				guestFromRemove = guest;
				break;
			}
		}
		guests.remove(guestFromRemove);
	}

	public int countGuests() {
		return guests.size();
	}

	public void displayGuests() {
		System.out.println(guests);
	}

}
