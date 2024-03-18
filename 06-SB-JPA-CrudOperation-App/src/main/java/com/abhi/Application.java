package com.abhi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.intity.User;
import com.abhi.repo.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		
//		  User u1 = new User(101, "Abhi", "Male", 22, "India"); 
//		  User u2 = new User(102,"Rahul", "Male", 23, "Japan"); 
//		  User u3 = new User(103, "Suraj", "Male", 25,"India");
//		  
//		  User u4 = new User(104, "Monu", "Male", 25, "Japan"); 
//		  User u5 = new User(105, "Lalu", "Male", 60, "India"); 
//		  User u6 = new User(106, "Sita", "Female",22, "Amerika"); 
		 
		  
		 
		//repository.save(u1);

		//repository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6));

		/*
		 * Optional<User> findById = repository.findById(104); if(findById.isPresent())
		 * { System.out.println(findById.get());
		 */

		/*
		 * Iterable<User> allById = repository.findAllById(Arrays.asList(101,102,103));
		 * allById.forEach(user-> { System.out.println(user); });
		 */
		/*
		 * Iterable<User> all = repository.findAll(); all.forEach(user->{
		 * System.out.println(user); });
		 */
		/*
		 * long count = repository.count(); System.out.println("Total record:" + count);
		 */
		
		/*boolean existsById = repository.existsById(102);
		System.out.println("Reecord present with id-102:"+existsById);*/
		
		//repository.deleteById(103);
		
		//repository.deleteAllById(Arrays.asList(102,104));
		
		//repository.deleteAll();	
	
//		List<User> byCountry = repository.findByCountry("India");
//		byCountry.forEach(user ->{
//		System.out.println(user);
//	});
		
//		List<User> byAge = repository.findByAge(23);
//		byAge.forEach(user->{
//			System.out.println(user);
//		});
		
		
//		List<User> byAgeGreaterThan = repository.findByAgeGreaterThan(23);
//		byAgeGreaterThan.forEach(user ->{
//			System.out.println(user);
//		});
		
//		List<User> byCountrayIn = repository.findByCountryIn(Arrays.asList("India","Japan"));
//		byCountrayIn.forEach(user->{
//			System.out.println(user);
//		});
		
//		List<User> byCountryAndAge = repository.findByCountryAndAge("Amerika", 22);
//		byCountryAndAge.forEach(user ->{
//			System.out.println(user);
//		});
		
//		List<User> byCountryAndGender = repository.findByCountryAndGender("Amerika", "Female");
//		byCountryAndGender.forEach(user->{
//			System.out.println(user);
//		});
		
		List<User> byCountryAndAgeAndGender = repository.findByCountryAndAgeAndGender("Japan", 23, "Male");
		byCountryAndAgeAndGender.forEach(user->{
			System.out.println(user);
		});
		

		
		
	}

}
