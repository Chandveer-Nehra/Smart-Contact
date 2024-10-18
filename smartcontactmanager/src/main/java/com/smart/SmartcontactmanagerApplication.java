package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SmartcontactmanagerApplication implements CommandLineRunner  {
	
	@Autowired
	private BCryptPasswordEncoder bryBCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SmartcontactmanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		
//		
		
	}

}

//Spring secuity

//1  when we use/configure  the spring secutiy then it secure the all the url
// but i secure only url those start with /user/




/**   LOGIN USING SPRING SECURITY
 * 
 * 1.. Provide the implementation of (USer Details) it is a interface  &&  (Customer User Deatils) it is a class
 * 
 * 2.. Provide the implementaion of (USer Detail Service) it is a interface && (USer datails Seervice) it is a class
 * 
 * 
 * 3..  Write Security Configuration class with all Configuration
 *      A Simple Class the Extends  (Web SecurityConfiguration Adaptor)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



