package model.map.product;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {

	private Map<Long, Product> products;

	public ProductInventory() {
		products = new HashMap<>();
	}

	public void addProduct(long id, String name, double price, int amount) {
		products.put(id, new Product(name, price, amount));
	}

	public void displayProducts() {
		System.out.println(products);
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;

		if (!products.isEmpty()) {
			for (Product product : products.values()) {
				totalPrice += product.getPrice() * product.getAmount();
			}
		}

		return totalPrice;
	}

	public Product getMostExpensiveProduct() {
		Product mostExpensiveProduct = null;
		double highestPrice = Double.MIN_VALUE;

		if (!products.isEmpty()) {
			for (Product product : products.values()) {
				if (product.getPrice() > highestPrice) {
					mostExpensiveProduct = product;
					highestPrice = product.getPrice();
				}
			}
		}

		return mostExpensiveProduct;
	}

	public Product getLeastExpensiveProduct() {
		Product leastExpensiveProduct = null;
		double leastPrice = Double.MAX_VALUE;

		if (!products.isEmpty()) {
			for (Product product : products.values()) {
				if (product.getPrice() < leastPrice) {
					leastExpensiveProduct = product;
					leastPrice = product.getPrice();
				}
			}
		}

		return leastExpensiveProduct;
	}

	public Product getProductWithHighestStockValue() {
		Product highestStockValue = null;
		double stockValue = Double.MIN_VALUE;

		if (!products.isEmpty()) {
			for (Product product : products.values()) {
				double currentStockValue = product.getPrice() * product.getAmount();
				if (currentStockValue > stockValue) {
					highestStockValue = product;
					stockValue = currentStockValue;
				}
			}
		}

		return highestStockValue;
	}

}
