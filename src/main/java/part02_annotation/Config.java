package part02_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAspectJAutoProxy

public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Bean
	public ServiceImp svc() {
		
		return new ServiceImp();
	}
	
	@Bean
	public AspectCommon common() {
		return new AspectCommon();
	}
	
	
}
