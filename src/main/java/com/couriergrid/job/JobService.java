package com.couriergrid.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;
	
	public List<Job> findAllJobs() {
		return jobRepository.findAll();
	}
	
	public Job findJob(int id) {
		return jobRepository.findById(id).get();
	}
	
	public Job addJob(Job job) {
		return jobRepository.save(job);
	}
	
	public Job updateJob(Job job) {
		return jobRepository.save(job);
	}
}
