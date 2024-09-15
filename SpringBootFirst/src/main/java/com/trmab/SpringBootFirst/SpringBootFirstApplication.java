package com.trmab.SpringBootFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		//it activate spring framework also hve container
		//object of spring called beans
		SpringApplication.run(SpringBootFirstApplication.class, args);
//		Alien alien = new Alien();
//		alien.code();
//		now i want spring to create this object which is done by application context


		//now SpringApplication.run(SpringBootFirstApplication.class, args); here run returns application ontext
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.code();


	}

}
