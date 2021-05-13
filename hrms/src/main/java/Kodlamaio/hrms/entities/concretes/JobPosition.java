package Kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "JobPositions")
public class JobPosition {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int Id;

	@Column(name = "Position")
	private String Position;

	public JobPosition() {

	}

	public JobPosition(int id,String position) {
		super();
		this.Id = id;
		this.Position = position;
	}

}
