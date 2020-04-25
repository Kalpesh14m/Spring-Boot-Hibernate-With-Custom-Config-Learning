package com.hibernet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringBootHibernetDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernetDemoApplication.class, args);
	}

}
