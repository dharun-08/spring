package com.example.backend;

import com.example.backend.model.Employee;
import com.example.backend.reppository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	private  EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Dharun");
		employee.setLastName("Kumar");
		employee.setEmail("dharun08@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Varun");
		employee1.setLastName("Kumar");
		employee1.setEmail("varun07@gmail.com");
		employeeRepository.save(employee1);
	}
}
