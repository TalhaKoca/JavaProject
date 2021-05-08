package ECommerceProject.business.validations.concretes;

import ECommerceProject.business.validations.abstracts.Validation;
import ECommerceProject.entities.concretes.User;

public class LoginValidation implements Validation {

	private static boolean result = true;

	public static boolean checkFormValid(User user) {
		checkEnteredRequired(user.getEmail(),user.getPassword());
		return result;
	}
	
	private static void checkEnteredRequired(String email, String password) {
		if (email.length() < 0 && password.length() < 0) {
			System.out.println("Giriþ formu eksik bilgiler içeriyor.");
			result = false;
		}
	}

}
