package model.map.event;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventSchedule {

	private Map<LocalDate, Event> events;

	public EventSchedule() {
		events = new HashMap<>();
	}

	public void addEvent(LocalDate date, String name, String attraction) {
		events.put(date, new Event(name, attraction));
	}

	public void displayEvents() {
		Map<LocalDate, Event> eventsInAsc = new TreeMap<>(events);
		System.out.println(eventsInAsc);
	}

	public void getNextEvent() {
		LocalDate currentDate = LocalDate.now();
		Map<LocalDate, Event> eventsInAsc = new TreeMap<>(events);

		for (Map.Entry<LocalDate, Event> entry : eventsInAsc.entrySet()) {
			if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
				System.out.println("Next Event: " + entry.getValue() + ", Date: " + entry.getKey());
				break;
			}
		}
	}

}
