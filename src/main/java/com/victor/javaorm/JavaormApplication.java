package com.victor.javaorm;

import com.victor.javaorm.entities.Employee;
import com.victor.javaorm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JavaormApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees = employeeRepository.findAll();

		employees.forEach(System.out::println);
	}
}
