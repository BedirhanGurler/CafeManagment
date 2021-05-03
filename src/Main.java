import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer fake = new Customer(1, "Engin", "Demiroð", "123456", 1990);
		Customer real = new Customer(2,"Bedirhan","Gürler","Buraya gerçek TCKN Yazýlmasý Gereklidir.", 2001);
		
		BaseCustomerManager nero = new NeroCustomerManager();
		nero.save(fake);
		
		BaseCustomerManager starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucks.save(real);

	}

}
