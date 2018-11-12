package com.actinver.ejercicioDanielGarcia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan(basePackages= {"com.actinver.cliente"})
public class EjercicioDanielGarciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioDanielGarciaApplication.class, args);
	}
}
