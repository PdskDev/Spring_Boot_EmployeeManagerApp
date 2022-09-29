package com.nadetdev.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@ComponentScan({"com.nadetdev.employeemanager"})
@EntityScan("com.nadetdev.employeemanager.model")
@EnableJpaRepositories("com.nadetdev.employeemanager.repository")
public class EmployeeManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}

}
