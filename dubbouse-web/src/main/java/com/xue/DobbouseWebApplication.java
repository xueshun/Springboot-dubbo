package com.xue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


//@ServletComponentScan
@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class DobbouseWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DobbouseWebApplication.class, args);
	}
}
