package ECommerceProject.googleAuth.concretes;

import ECommerceProject.entities.concretes.User;
import ECommerceProject.googleAuth.abstracts.GoogleAuthService;

public class GoogleAuthManager implements GoogleAuthService{
	public void login(User user) {
		System.out.println("Google hesabýnýz ile giriþ saðlandý.");
	}

	public void register(User user) {
		System.out.println("Google hesabýnýz ile kayýt gerçekleþtirildi.");
	}

}
