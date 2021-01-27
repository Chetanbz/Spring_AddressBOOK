package com.example.addressbok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressbokApplication {

	public static void main(String[] args) {
		System.out.print("hello application started");
		ApplicationContext context = SpringApplication.run(AddressbokApplication.class, args);
		log.debug("Employee Payroll App Started in {} Environment ",
				context.getEnvironment().getProperty("environment"));
	}

}
