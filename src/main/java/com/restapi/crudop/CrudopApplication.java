package com.restapi.crudop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CrudopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudopApplication.class, args);
	}

}
