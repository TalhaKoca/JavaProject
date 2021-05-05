package BackendOfGame.entities.concretes;
import java.time.LocalDate;

import BackendOfGame.entities.abstracts.Entity;

public class Customer implements Entity {
	int id;
	String nationalIdentity;
	String firstName;
	String lastName;
	LocalDate birthOfYear;

	public Customer() {

	}

	public Customer(int id, String nationalIdentity,String firstName,String lastName,LocalDate birthOfYear) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.birthOfYear = birthOfYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
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

	public LocalDate getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(LocalDate birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
}
