package ECommerceProject.core.adapters.abstracts;

import ECommerceProject.entities.concretes.User;

public interface BaseAccountsService {
	void login(User user);
	void register(User user);
}
