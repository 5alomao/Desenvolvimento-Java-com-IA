package model.list.book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

	private List<Book> books;

	public BookCatalog() {
		this.books = new ArrayList<>();
	}

	public void addBook(String title, String author, int publicationYear) {
		books.add(new Book(title, author, publicationYear));
	}

	public List<Book> searchBooksByAuthor(String author) {
		List<Book> booksByAuthor = new ArrayList<>();

		if (!books.isEmpty()) {
			for (Book book : books) {
				if (book.getAuthor().equalsIgnoreCase(author))
					booksByAuthor.add(book);
			}
		}

		return booksByAuthor;
	}

	public List<Book> searchBooksByYearRange(int initialYear, int finalYear) {

		List<Book> booksInRange = new ArrayList<>();

		if (!books.isEmpty()) {
			for (Book book : books) {
				if (book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear)
					booksInRange.add(book);
			}
		}

		return booksInRange;
	}

	public Book findBookByTitle(String title) {
		Book foundBook = null;
		if (!books.isEmpty()) {
			for (Book book : books) {
				if (book.getTitle().equalsIgnoreCase(title)) {
					foundBook = book;
					break;
				}
			}
		}
		return foundBook;
	}
}
