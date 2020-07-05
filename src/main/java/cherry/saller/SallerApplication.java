package cherry.saller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("services")
public class SallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SallerApplication.class, args);
	}

}
