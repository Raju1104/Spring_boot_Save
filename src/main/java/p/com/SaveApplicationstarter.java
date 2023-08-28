package p.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value="classpath:p.properties")
@SpringBootApplication
public class SaveApplicationstarter {

	  
	public static void main(String[] args) {
		SpringApplication.run(SaveApplicationstarter.class, args);
	}

}
