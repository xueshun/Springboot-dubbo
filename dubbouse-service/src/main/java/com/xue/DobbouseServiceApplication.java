package com.xue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


//@ServletComponentScan
@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class DobbouseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DobbouseServiceApplication.class, args);
	}
}
