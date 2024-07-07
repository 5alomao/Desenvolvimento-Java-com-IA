package model.set.guest;

import java.util.Objects;

public class Guest {

	private String name;
	private int invitationCode;

	public Guest(String name, int invitationCode) {
		this.name = name;
		this.invitationCode = invitationCode;
	}

	public String getName() {
		return name;
	}

	public int getInvitationCode() {
		return invitationCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(invitationCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Guest))
			return false;
		Guest other = (Guest) obj;
		return invitationCode == other.invitationCode;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", InvitationCode: " + invitationCode;
	}
}
