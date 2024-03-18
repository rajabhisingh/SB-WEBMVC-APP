package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.entities.Contactsmasterentity;
import com.abhi.repositories.ContactMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactMasterRepo bean = context.getBean(ContactMasterRepo.class);
		Contactsmasterentity entity = new Contactsmasterentity();
		entity.setContectId(101);
		entity.setContectName("najesh");
		entity.setContectNumber(894); 
		bean.save(entity);
		System.out.println(entity.getContectName()+","+entity.getContectId()+","+entity.getContectNumber());
		
		context.close();
	}

}

