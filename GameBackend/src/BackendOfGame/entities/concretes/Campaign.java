package BackendOfGame.entities.concretes;
import java.time.LocalDate;

import BackendOfGame.entities.abstracts.Entity;

public class Campaign implements Entity {
	int id;
	int percentOfDiscount;
	String name;
	LocalDate validDate;

	public Campaign(int id, int percentOfDiscount, String name, LocalDate validDate) {
		this.id = id;
		this.percentOfDiscount = percentOfDiscount;
		this.name = name;
		this.validDate = validDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPercentOfDiscount() {
		return percentOfDiscount;
	}

	public void setPercentOfDiscount(int percentOfDiscount) {
		this.percentOfDiscount = percentOfDiscount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
