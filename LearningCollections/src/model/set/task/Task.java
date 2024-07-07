package model.set.task;

import java.util.Objects;

public class Task {

	private String description;
	private boolean done;

	public Task(String description, boolean done) {
		this.description = description;
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Task))
			return false;
		Task other = (Task) obj;
		return Objects.equals(description, other.description);
	}

	@Override
	public String toString() {
		return "Description: " + this.description + ", isDone: " + this.done;
	}

}
