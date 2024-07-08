package model.map.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BookMap {

	private Map<String, Book> books;

	public BookMap() {
		this.books = new HashMap<>();
	}

	public void addBook(String link, String title, String author, double price) {
		books.put(link, new Book(title, author, price));
	}

	public void removeBook(String title) {
		List<String> booksFromRemove = new ArrayList<>();
		if (!books.isEmpty()) {

			for (Map.Entry<String, Book> entry : books.entrySet()) {
				if (entry.getValue().getTitle().equalsIgnoreCase(title))
					booksFromRemove.add(entry.getKey());
			}

			for (String key : booksFromRemove) {
				books.remove(key);
			}
		}
	}

	public Map<String, Book> sortByPrice() {

		if (!books.isEmpty()) {
			List<Map.Entry<String, Book>> sortedByPriceList = new ArrayList<>(books.entrySet());
			Collections.sort(sortedByPriceList, new BookPriceComparator());

			Map<String, Book> sortedByPriceMap = new LinkedHashMap<>();

			for (Map.Entry<String, Book> entry : sortedByPriceList) {
				sortedByPriceMap.put(entry.getKey(), entry.getValue());
			}

			return sortedByPriceMap;
		}

		return null;
	}

	public Map<String, Book> sortByAuthor() {

		if (!books.isEmpty()) {
			List<Map.Entry<String, Book>> sortedByAuthorList = new ArrayList<>(books.entrySet());
			Collections.sort(sortedByAuthorList, new BookAuthorComparator());

			Map<String, Book> sortedByAuthorMap = new LinkedHashMap<>();

			for (Map.Entry<String, Book> entry : sortedByAuthorList) {
				sortedByAuthorMap.put(entry.getKey(), entry.getValue());
			}

			return sortedByAuthorMap;
		}

		return null;

	}

	public Map<String, Book> searchBooksByAuthor(String author) {
		Map<String, Book> booksByAuthor = new HashMap<>();

		if (!books.isEmpty()) {
			for (Map.Entry<String, Book> entry : books.entrySet()) {
				Book book = entry.getValue();
				if (book.getAuthor().equalsIgnoreCase(author))
					booksByAuthor.put(entry.getKey(), book);
			}
		}

		return booksByAuthor;
	}

	public Book getMostExpensiveBook() {
		Book mostExpensiveBook = null;
		double price = Double.MIN_VALUE;

		if (!books.isEmpty()) {
			for (Book book : books.values()) {
				if (book.getPrice() > price) {
					price = book.getPrice();
					mostExpensiveBook = book;
				}
			}
		}

		return mostExpensiveBook;
	}

	public Book getLeastExpensiveBook() {
		Book leastExpensiveBook = null;
		double price = Double.MAX_VALUE;

		if (!books.isEmpty()) {
			for (Book book : books.values()) {
				if (book.getPrice() < price) {
					price = book.getPrice();
					leastExpensiveBook = book;
				}
			}
		}

		return leastExpensiveBook;
	}
}
