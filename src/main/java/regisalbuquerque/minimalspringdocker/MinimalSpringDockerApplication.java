package regisalbuquerque.minimalspringdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MinimalSpringDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimalSpringDockerApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

}
