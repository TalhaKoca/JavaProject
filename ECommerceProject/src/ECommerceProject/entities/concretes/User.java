package ECommerceProject.entities.concretes;

import ECommerceProject.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String verificationCode;
	private String confirmVerificationCode;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	
	public void setConfirmVerificationCode(String confirmVerificationCode) {
		boolean result = this.verificationCode.equals(confirmVerificationCode);
		if(!result) {
			System.out.println("Etkileþim baþarýsýz.");
			return;
		}
		this.confirmVerificationCode = confirmVerificationCode;
		System.out.println("Aktivasyon iþlemi baþarýyla gerçekleþtirildi.");
	}
	
	public boolean checkVerificationCode() {
		if(!(this.verificationCode==null)) {
			return this.verificationCode.equals(this.confirmVerificationCode);
		}
		return false;
	}
}
