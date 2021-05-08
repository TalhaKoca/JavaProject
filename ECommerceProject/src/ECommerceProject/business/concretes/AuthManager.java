package ECommerceProject.business.concretes;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ECommerceProject.business.abstracts.AuthService;
import ECommerceProject.business.abstracts.UserService;
import ECommerceProject.business.validations.concretes.LoginValidation;
import ECommerceProject.business.validations.concretes.RegisterValidation;
import ECommerceProject.core.adapters.abstracts.BaseAccountsService;
import ECommerceProject.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;
	private BaseAccountsService baseAccountsService;

	public AuthManager(UserService userService, BaseAccountsService baseAccountsService) {
		this.userService = userService;
		this.baseAccountsService = baseAccountsService;
	}

	@Override
	public void register(User user) {
		boolean checkValid = RegisterValidation.checkFormValid(user);
		if (!checkValid) {
			return;
		}

		boolean userExists = checkIfEmailExists(user.getEmail().toLowerCase(Locale.ROOT));
		if (!userExists) {
			System.out.println("Girilen mail adresi sistemde kayýtlý. Farklý bir adresle tekrar deneyiniz.");
			return;
		}
		userService.add(user);
		user.setVerificationCode("RANDOMNUMBER");
		System.out.println(
				"Kullanýcý kaydý baþarýyla gerçekleþtirildi. E-Postanýza gönderilen doðrulama linkini týklayýnýz.");
	}

	@Override
	public void login(User user) {
		boolean checkValid = LoginValidation.checkFormValid(user);
		if (!checkValid) {
			System.out.println("Giriþ formu eksik bilgiler içeriyor.");
			return;
		}

		if (!user.checkVerificationCode()) {
			System.out.println("Mail adresinize gönderilen baðlantý linki ile doðrulama yapýnýz.");
			return;
		}

		System.out.println("Ana sayfaya yönlendiriliyorsunuz.Lütfen bekleyiniz.");
	}

	public void registerGoogleService(User user) {

		boolean checkValid = RegisterValidation.checkFormValid(user);
		if (!checkValid) {
			return;
		}

		boolean userExists = checkIfEmailExists(user.getEmail());
		if (!userExists) {
			System.out.println("Girilen mail adresi sistemde kayýtlý. Farklý bir adresle tekrar deneyiniz.");
			return;
		}

		user.setVerificationCode("RANDOM NUMBER");
		System.out.println("E-Postanýza gönderilen doðrulama linkini týklayarak hesabý etkinleþtirin.");
		this.baseAccountsService.register(user);
	}

	public void loginGoogleService(User user) {

		boolean checkValid = LoginValidation.checkFormValid(user);
		if (!checkValid) {
			System.out.println("Giriþ formu eksik bilgiler içeriyor.");
			return;
		}

		if (!user.checkVerificationCode()) {
			System.out.println("Aktivasyon kodu doðrulanmadý!");
			return;
		}

		this.baseAccountsService.login(user);
	}

	private boolean checkIfEmailExists(String email) {
		User result = userService.getByEmail(email);
		System.out.println(result.getEmail());
		if (result.getEmail()== null) {
			return true;
		}

		return false;
	}
}
