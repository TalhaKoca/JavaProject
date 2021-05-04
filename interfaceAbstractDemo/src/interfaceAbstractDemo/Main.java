package interfaceAbstractDemo;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Talha","KOCA",LocalDate.of(1996,04,05),"30464110144"));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager2.save(new Customer(1,"Talha","KOCA",LocalDate.of(1996,04,05),"30464110144"));

	}

}
