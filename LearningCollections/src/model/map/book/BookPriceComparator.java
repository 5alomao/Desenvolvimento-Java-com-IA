package model.map.book;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class BookPriceComparator implements Comparator<Map.Entry<String, Book>> {

	@Override
	public int compare(Entry<String, Book> o1, Entry<String, Book> o2) {
		return Double.compare(o1.getValue().getPrice(), o2.getValue().getPrice());
	}
}
