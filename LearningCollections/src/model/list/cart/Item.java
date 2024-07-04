package model.list.cart;

public class Item {

	private String name;
	private double price;
	private int amount;

	public Item(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Price: " + price + ", Amount:" + amount;
	}
}
