package com.couriergrid.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	
	@Autowired
	private JobService JobService;
	
	@RequestMapping("/couriergrid-api")
	public String sayWorking() {
		return "weolcome to couriergrid-api...";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/couriergrid-api/jobs")
	public List<Job> getAllJobs() {
		return JobService.findAllJobs();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/couriergrid-api/jobs/{id}")
	public Job findJob(@PathVariable int id) {
		return JobService.findJob(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/couriergrid-api/jobs")
	public Job addJob(@RequestBody Job job) {
		return JobService.addJob(job);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/couriergrid-api/jobs/{id}")
	public Job updateJob(@RequestBody Job job) {
		return JobService.updateJob(job);
	}
	
	

}
