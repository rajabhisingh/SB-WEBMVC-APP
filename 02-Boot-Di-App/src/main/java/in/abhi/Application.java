package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.abhi.dao.UserDao;
import in.abhi.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		 UserDao dao = context.getBean(UserDao.class);
//		 String findname = dao.findName(100);
//		 System.out.println(findname);
		 
		  UserService service = context.getBean(UserService.class);
		  service.getName(100);
		 
		
	}

}
