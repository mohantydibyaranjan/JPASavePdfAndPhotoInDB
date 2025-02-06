package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.JobSeekerRepo;
@Service
public class JobSeekerServiceIMPL implements JobSeekerService {
	@Autowired
	private JobSeekerRepo jobSeekerrepo;

	     @Override
	      public String registerJobSeekerJs(JobSeeker js) {
	    Integer id = jobSeekerrepo.save(js).getId();
		  return "job seeker is registered with the id val is "+id ;
	}

}
