package ECommerceProject.business.abstracts;

import ECommerceProject.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
}
