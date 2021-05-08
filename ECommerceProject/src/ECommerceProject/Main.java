package ECommerceProject;

import ECommerceProject.business.concretes.AuthManager;
import ECommerceProject.business.concretes.UserManager;
import ECommerceProject.core.adapters.concretes.GoogleAuthManagerAdapter;
import ECommerceProject.dataAccess.concretes.HibernateUserDao;
import ECommerceProject.entities.concretes.User;
import ECommerceProject.googleAuth.concretes.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Admin","Manager","talha@talha.com","1234569");
		
		UserManager userManager = new UserManager(new HibernateUserDao());
		System.out.println(userManager.getByEmail("talha@talha.com"));
		
		System.out.println("**********************");
		
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()),new GoogleAuthManagerAdapter(new GoogleAuthManager()));
		authManager.registerGoogleService(user);
		//user.setConfirmVerificationCode("RANDOM NUMBER");
		//authManager.loginGoogleService(user);
	}

}
