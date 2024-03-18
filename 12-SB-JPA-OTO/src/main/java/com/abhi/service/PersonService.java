package com.abhi.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.Passport;
import com.abhi.entity.Person;
import com.abhi.repo.PassportRepo;
import com.abhi.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	public void getPerson() {
		personRepo.findById(1);
	}
	
	
	public void savePerson() {
		Person p = new Person();
		p.setName("Abhi");
	    p.setGender("Male");
	    
	    Passport pp = new Passport();
	    pp.setPassportNum("JJJ8678");
	    pp.setIssDate(LocalDate.now());
	    pp.setExpDate(LocalDate.now().plusYears(10));
	    
	    p.setPassport(pp);
	    pp.setPerson(p);
	    personRepo.save(p); 
	    System.out.println("Record inserted");
		}
	
}
