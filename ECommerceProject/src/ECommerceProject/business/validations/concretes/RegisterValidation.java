package ECommerceProject.business.validations.concretes;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import ECommerceProject.business.validations.abstracts.Validation;
import ECommerceProject.entities.concretes.User;

public class RegisterValidation implements Validation {

	private static boolean result = true;

	public static boolean checkFormValid(User user) {
		checkMinCharacter(user.getFirstName(), user.getLastName());
		checkEmailFormat(user.getEmail());
		checkPasswordLength(user.getPassword());
		return result;
	}

	private static void checkPasswordLength(String password) {
		if (password.length() < 6) {
			System.out.println("�ifre en az 6 karakterden olu�mal�d�r.");
			result = false;
		}

	}

	private static void checkMinCharacter(String firstName, String lastName) {
		if (firstName.length() < 2 && lastName.length() < 2) {
			System.out.println("Kullan�c� ad� ve soyad� en az 2 karakterden olu�mal�d�r.");
			result = false;
		}
	}

	private static void checkEmailFormat(String email) {
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email.toLowerCase(Locale.ROOT));
		
		if (!matcher.matches()) {
			System.out.println("L�tfen ge�erli bir email adresi giriniz!");
			result = false;
		} else {
			System.out.println(email + " adresi ge�erli");
		}

	}

}

//email = JOptionPane.showInputDialog(email);
//email.matches("(?simx)\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b")