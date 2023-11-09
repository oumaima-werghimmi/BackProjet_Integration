package projet.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("projet.integration.entities")
public class ProjetIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetIntegrationApplication.class, args);
	}

}
