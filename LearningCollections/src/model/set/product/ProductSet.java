package model.set.product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductSet {

	private Set<Product> products;

	public ProductSet() {
		products = new HashSet<>();
	}

	public void addProduct(long id, String name, double price) {
		products.add(new Product(id, name, price));
	}

	public Set<Product> sortByName() {
		Set<Product> sortedProductByName = new TreeSet<>(products);
		return sortedProductByName;
	}

	public Set<Product> sortByPrice() {
		Set<Product> sortedProductByPrice = new TreeSet<>(new ProductPriceComparator());
		sortedProductByPrice.addAll(products);
		return sortedProductByPrice;
	}

	public void displayProducts() {
		System.out.println(products);
	}

}
