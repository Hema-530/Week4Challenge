package com.week2ass.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.week2ass.StudentService")
@ComponentScan("com.week2ass.week2.StudentController")
public class StudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(StudentApplication.class, args);
		System.out.println("contains resbean"+context.containsBeanDefinition("resbean"));
	}

}
