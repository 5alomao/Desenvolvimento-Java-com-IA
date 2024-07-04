package model.list.task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private List<Task> tasks;

	public TaskList() {
		this.tasks = new ArrayList<>();
	}

	public void addTask(String description) {
		tasks.add(new Task(description));
	}

	public void removeTask(String description) {
		List<Task> tasksFromRemove = new ArrayList<>();
		for (Task task : tasks) {
			if (task.getDescription().equalsIgnoreCase(description))
				tasksFromRemove.add(task);
		}
		tasks.removeAll(tasksFromRemove);
	}

	public int totalTasks() {
		return tasks.size();
	}
	
	public void getAllTasksDescriptions() {
		System.out.println(tasks);
	}
}
