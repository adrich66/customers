package com.example.customers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationCommandRunner implements CommandLineRunner {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	CustomerService customerservice;

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Welcome to the runner from CommandLineRunner");
		
		Customer customer1 = new Customer("1", "Tom", "Holland", 1996);
		Customer customer2 = new Customer("2", "Dwayne", "Johnson", 1972);
		Customer customer3 = new Customer("3", "Brad", "Pitt", 1963);
		Customer customer4 = new Customer("4", "Scarlett", "Johansson", 1984);
		
		customerservice.save(customer1);
		customerservice.save(customer2);
		customerservice.save(customer3);
		customerservice.save(customer4);
	
		logger.info(customerservice.findAll());
		
		//customerservice.findAndDeleteById("1");
	
	}
}
