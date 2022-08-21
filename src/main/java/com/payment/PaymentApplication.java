package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		
		System.out.println("*************PaymentApplication**********");
		SpringApplication.run(PaymentApplication.class, args);
	}

}
