package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to the Oracle database");
		} else {
			System.out.println("Not a valid person");
		}
	}

}
