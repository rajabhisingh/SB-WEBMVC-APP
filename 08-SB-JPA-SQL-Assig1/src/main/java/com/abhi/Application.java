package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		
		PersonService service = context.getBean(PersonService.class);
		service.savePerson();
		
	}

}
