package model.list.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> cartItems;

	public Cart() {
		this.cartItems = new ArrayList<>();
	}

	public void addToCart(String name, double price, int amount) {
		cartItems.add(new Item(name, price, amount));
	}

	public void removeItem(String name) {
		List<Item> itemsFromRemove = new ArrayList<>();

		for (Item item : itemsFromRemove) {
			if (item.getName().equalsIgnoreCase(name))
				itemsFromRemove.add(item);
		}

		cartItems.removeAll(itemsFromRemove);
	}

	public double calculateTotalPrice() {
		double total = 0;
		
		for (Item item : cartItems) {
			total += item.getPrice() * item.getAmount();
		}

		total = Math.round(total * 100.0) / 100.0;
		
		return total;
	}

	public void displayCartItems() {
		System.out.println(cartItems);
	}
}
