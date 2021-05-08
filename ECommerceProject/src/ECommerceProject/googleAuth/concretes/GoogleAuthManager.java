package ECommerceProject.googleAuth.concretes;

import ECommerceProject.entities.concretes.User;
import ECommerceProject.googleAuth.abstracts.GoogleAuthService;

public class GoogleAuthManager implements GoogleAuthService{
	public void login(User user) {
		System.out.println("Google hesab�n�z ile giri� sa�land�.");
	}

	public void register(User user) {
		System.out.println("Google hesab�n�z ile kay�t ger�ekle�tirildi.");
	}

}
