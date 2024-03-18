package in.abhi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.abhi.util.AppSecurity;

@Configuration
public class AppConfig {
public AppConfig() {
	System.out.println("AppConfig :: Constractor");
}
@Bean	
public AppSecurity security() {
	System.out.println("Bean method called.....");
	AppSecurity se = new AppSecurity();
	//logic
	return se;
}
}

