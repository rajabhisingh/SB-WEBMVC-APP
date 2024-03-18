package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"in.abhi","com.tcs"})
public class BootApp01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootApp01Application.class, args);
		System.out.println(context.getClass().getName());
		System.out.println(context.getBeanDefinitionCount());
	}

}
