package com.iiht.training.eloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
@ComponentScan(basePackages = {"es.unileon.inso2"})
@EntityScan("es.unileon.inso2.model")
@EnableJpaRepositories("es.unileon.inso2.repository")
public class EloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(EloanApplication.class, args);
	}

}
