package Kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.hrms.business.abstracts.JobPositionService;
import Kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/positions")
public class JobPositionsController {
	
	private JobPositionService positionService;	
	
	@Autowired
	public JobPositionsController(JobPositionService positionService) {
		super();
		this.positionService = positionService;
	}
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.positionService.getAll();
	}
}
