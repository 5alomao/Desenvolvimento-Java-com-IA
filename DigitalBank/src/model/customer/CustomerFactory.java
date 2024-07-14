package model.customer;

public class CustomerFactory {

	public static Customer createCustomer(int id, String name) {
		return new Customer(id, name);
	}
	
}
