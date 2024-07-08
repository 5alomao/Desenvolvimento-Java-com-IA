package model.map.book;

public class Book implements Comparable<Book> {

	private String title, author;
	private double price;

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public int compareTo(Book o) {
		return Double.compare(this.price, o.getPrice());
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price;
	}
}
