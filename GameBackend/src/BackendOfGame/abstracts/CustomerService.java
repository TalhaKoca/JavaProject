package BackendOfGame.abstracts;

import BackendOfGame.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);

	void delete(Customer customer);

	void update(Customer customer);
}
