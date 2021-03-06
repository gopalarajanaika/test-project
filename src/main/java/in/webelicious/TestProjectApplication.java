package in.webelicious;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestProjectApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
		return application.sources(TestProjectApplication.class);
	} 
	
	public static void main(String[] args) 
	{
		SpringApplication.run(TestProjectApplication.class, args);
	}

	@RequestMapping(value = "/hello")
	public String helloWorld()
	{
		return "Hello World, Peter";
	}
}
