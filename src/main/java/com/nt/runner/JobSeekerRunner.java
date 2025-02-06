package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.JobSeekerServiceIMPL;
@Component
public class JobSeekerRunner implements CommandLineRunner {
	
	@Autowired
	private JobSeekerServiceIMPL jobSeekerIMPL;

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the jobseeker name :");
		String name = sc.nextLine();
		System.out.println("enter the jobseeker address");
		String address = sc.nextLine();
		System.out.println("is the jobSeeker indian ?");
		boolean isIndian = sc.nextBoolean();
		System.out.println("enter the photo file path");
			String photo = sc.nextLine();
			photo = sc.nextLine();
			
			
		System.out.println("enter the resume path");
		String resume = sc.nextLine();
		
		//convert the  photofile to byte
		FileInputStream fis =new FileInputStream(photo);
		byte[] photoData=new byte[fis.available()];
		byte[] photoBytes = fis.readAllBytes();
		
		//converrt the resume data file to char
		File file =new File(resume);
		FileReader fr=new FileReader(resume);
		long length = file.length();
		char[] resumeData=new char[(int) length];
		fr.read(resumeData);
		
		//prepare entity class object
		JobSeeker js=new JobSeeker(name, address, photoBytes, resumeData, isIndian);
		
		try {
			String registerJobSeekerJs = jobSeekerIMPL.registerJobSeekerJs(js);
			System.out.println(registerJobSeekerJs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
