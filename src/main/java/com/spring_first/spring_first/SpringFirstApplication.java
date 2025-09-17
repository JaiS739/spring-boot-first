package com.spring_first.spring_first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
	}

	private PaymentService paymentService;

	public SpringFirstApplication (PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public void run(String... args) throws Exception {
		String payment = paymentService.pay();
		System.out.println(payment);
	}
}
