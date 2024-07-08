package model.map.book;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class BookAuthorComparator implements Comparator<Map.Entry<String, Book>> {

	@Override
	public int compare(Entry<String, Book> o1, Entry<String, Book> o2) {
		return o1.getValue().getAuthor().compareTo(o2.getValue().getAuthor());
	}
	
}
