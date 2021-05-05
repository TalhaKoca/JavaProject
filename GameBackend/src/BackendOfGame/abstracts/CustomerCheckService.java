package BackendOfGame.abstracts;

import BackendOfGame.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
