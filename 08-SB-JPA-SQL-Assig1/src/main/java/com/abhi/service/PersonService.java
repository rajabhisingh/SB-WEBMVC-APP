package com.abhi.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.Person;
import com.abhi.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
    private PersonRepo personRepo;
	
	public void savePerson() throws Exception {
		String imagePath ="D:\\p\\Temp1.jpg";
		Person  person = new Person();
		
		person.setName("ABHI");
		person.setGender("MALE");
		//person.setDob("12-02-2000");
		//person.se
		
//		long size = Files.size(Paths.get(imagePath));
//		byte[] arr = new byte[(int)size];
		byte[] arr = new byte[65535];
		FileInputStream fis = new FileInputStream(new File(imagePath));
		fis.read(arr);
		fis.close();
		person.setPhoto(arr);
		
 		personRepo.save(person);
	}
    

   
}
