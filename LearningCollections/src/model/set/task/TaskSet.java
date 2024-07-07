package model.set.task;

import java.util.HashSet;
import java.util.Set;

public class TaskSet {

	private Set<Task> tasks;

	public TaskSet() {
		tasks = new HashSet<>();
	}

	public void addTask(String description, boolean done) {
		tasks.add(new Task(description, done));
	}

	public void removeTaskByDescription(String description) {
		Task taskFromRemove = null;

		if (!tasks.isEmpty()) {
			for (Task task : tasks) {
				if (task.getDescription().equalsIgnoreCase(description)) {
					taskFromRemove = task;
					break;
				}
			}
		}

		tasks.remove(taskFromRemove);
	}

	public void displayTasks() {
		System.out.println(tasks);
	}

	public int countTasks() {
		return tasks.size();
	}

	public Set<Task> getDoneTasks() {
		Set<Task> doneTasks = new HashSet<>();

		if (!tasks.isEmpty()) {
			for (Task task : tasks) {
				if (task.isDone() == true)
					doneTasks.add(task);
			}
		}

		return doneTasks;
	}

	public Set<Task> getPendingTasks() {
		Set<Task> pendingTasks = new HashSet<>();

		if (!tasks.isEmpty()) {
			for (Task task : tasks) {
				if (!task.isDone())
					pendingTasks.add(task);
			}
		}

		return pendingTasks;
	}

	public Task markTaskAsCompleted(String description) {
		Task completedTask = null;

		if (!tasks.isEmpty()) {
			for (Task task : tasks) {
				if (task.getDescription().equalsIgnoreCase(description)) {
					task.setDone(true);
					completedTask = task;
					break;
				}
			}
		}

		return completedTask;
	}

	public Task markTaskAsPending(String description) {
		Task pendingTask = null;

		if (!tasks.isEmpty()) {
			for (Task task : tasks) {
				if (task.getDescription().equalsIgnoreCase(description)) {
					task.setDone(false);
					pendingTask = task;
					break;
				}
			}
		}

		return pendingTask;
	}
	
	public void deleteAllTasks() {
		tasks.clear();
	}
}
