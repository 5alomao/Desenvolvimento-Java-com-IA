package model.set.product;

import java.util.Objects;

public class Product implements Comparable<Product> {

	private long id;
	private String name;
	private double price;

	public Product(long id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Product o) {
		return this.name.compareTo(o.getName());
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + ", Name: " + this.name + ", Price: $" + this.price;
	}
}
