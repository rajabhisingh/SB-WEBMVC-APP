package com.abhi.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.stereotype.Component;

import com.abhi.entity.Contact;
import com.abhi.repo.ContectRepository;

@Component
public class MyAppRunner implements SpringApplicationRunListener {

	@Autowired
	private ContectRepository contectRepository;
    
	public void run(ApplicationArguments args) throws Exception{
		
		Contact c1 = new Contact();
		c1.setName("Abhi");
		c1.setPhno(9078264877L);
		
		Contact c2 = new Contact();
		c1.setName("Raj");
		c1.setPhno(778879867l);
		
	    contectRepository.saveAll(Arrays.asList(c1,c2));
	    
		
	}
}
