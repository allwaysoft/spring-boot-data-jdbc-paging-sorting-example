package com.javabydeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	/*
	@Bean
	QueryMappingConfiguration rowMappers() {
		return new DefaultQueryMappingConfiguration()
				.registerRowMapper(User.class, new UserRowMapper());
	}
	*/

}
