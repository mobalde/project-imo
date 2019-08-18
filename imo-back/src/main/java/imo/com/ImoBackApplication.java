package imo.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@PropertySource("classpath:application.properties")
public class ImoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoBackApplication.class, args);
	}

}
