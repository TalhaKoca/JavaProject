package BackendOfGame.concretes;

import BackendOfGame.abstracts.CustomerCheckService;
import BackendOfGame.abstracts.CustomerService;
import BackendOfGame.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Oyuncu bilgileri eklendi.");

		}else {
			System.out.println("Kimlik doðrulama hatasý");
		}

	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Oyuncu bilgileri silindi");

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Oyuncu bilgileri güncellendi");

	}

}
