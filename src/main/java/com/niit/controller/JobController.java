package com.niit.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.DAO.JobDAO;
import com.niit.Model.Job;


@RestController
public class JobController {
	@Autowired
	JobDAO jobDAO;
	@GetMapping (value="/insertJob")
	public ResponseEntity<String> insertJob(@RequestBody Job job){
		if(jobDAO.addJob(job))
		{
			return new ResponseEntity<String>("Job Added",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Error in ResponseEntity",HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
	@PostMapping(value="/updateJob")
	public ResponseEntity<String> updateJob(@RequestBody Job job){
		Job tempJob=jobDAO.getJob(job.getJobId());
		tempJob.setJobProfile(job.getJobProfile());
		tempJob.setJobDesc(job.getJobDesc());
		if(jobDAO.updateJob(job))
		{
			return new ResponseEntity<String>("Job Updated",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Error in Updation",HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
	@GetMapping(value="/getAllJobs")
	public ResponseEntity<ArrayList<Job>>getAllJobs(){
		ArrayList listJobs=(ArrayList)jobDAO.getAlljobs();
		return new ResponseEntity<ArrayList<Job>>(listJobs,HttpStatus.OK);
	}
	@PostMapping(value="/deleteJob")
	public ResponseEntity<String> deleteJob(@RequestBody Job job)
	{
		/*Job job=jobDAO.getJob(job.getJobId());*/
		if(jobDAO.deleteJob(job)){
			return new ResponseEntity<String>("Job deleted",HttpStatus.OK);
		}
		else{
			return new ResponseEntity<String>("Error in deletion",HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
