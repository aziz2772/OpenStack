package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories("tn.esprit.spring.repo")
@EnableWebMvc
@EnableSwagger2
@SpringBootApplication
public class KidzoneAApplication {

	public static void main(String[] args) {
		SpringApplication.run(KidzoneAApplication.class, args);
	}

}
