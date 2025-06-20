package com.ourfirstapp.first_spring_app;

import com.ourfirstapp.first_spring_app.model.Address;
import com.ourfirstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello everyone, This is our first Spring Boot App!!!");

//		// tight coupling
//		Employee emp1 = new Employee();
//		emp1.id=123;
//		emp1.name="Ajay";
//		emp1.email="ajay123@gmail.com";
//		emp1.designation="developer";
//
//		Address adrs1 = new Address();
//		adrs1.doorNo=999;
//		adrs1.streetName="some street";
//		adrs1.city="some city";
//
//		emp1.address = adrs1;
//
//		System.out.println("emp1 is : "+emp1);
//		System.out.println("adrs1 is : "+adrs1);
//
//		adrs1.streetName="new street";
//		adrs1.city="new city";
//
//		System.out.println("emp1 after adrs1 change is : "+emp1);
//		System.out.println("adrs1 after adrs1 change is : "+adrs1);


		//loose coupling
		//setter injection
		Employee emp1 = new Employee();
		emp1.setId(125);
		emp1.setName("Vijay");
		emp1.setEmail("vijay123@gmail.com");
		emp1.setDesignation("developer");

		Address adrs1 = new Address();
		adrs1.setDoorNo(333);
		adrs1.setStreetName("Some old street");
		adrs1.setCity("old city");

		emp1.setAddress(adrs1);

		System.out.println("emp1 is : "+emp1);
		System.out.println("adrs1 is : "+adrs1);

		emp1.getAddress().setStreetName("new street");
		emp1.getAddress().setCity("new city");

		System.out.println("emp1 after adrs1 change is : "+emp1);
		System.out.println("adrs1 after adrs1 change is : "+adrs1);

		// constructor injection

		Address adrs2 = new Address(666, "street2","city2");
		Employee emp2 = new Employee(334, "Sanjay","sanjay123@gmail.com","developer",adrs2);
		System.out.println("emp2 is : "+emp2);
		System.out.println("adrs2 is : "+adrs2);

		emp2.getAddress().setCity("new city");
		System.out.println("emp2 after address change is : "+emp2);
		System.out.println("adrs2 after address change is : "+adrs2);

	}

}