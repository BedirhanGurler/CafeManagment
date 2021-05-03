package concrete;

import abstracts.BaseCustomerManager;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	public void save(Customer customer) {
		System.out.println("Nero Customer Saved.");
	}
}
