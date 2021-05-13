package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
