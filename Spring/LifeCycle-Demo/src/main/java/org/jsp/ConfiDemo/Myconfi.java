package org.jsp.ConfiDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.jsp")
public class Myconfi {
@Bean
public Bike getBike() {
	return new Bike();
	
}
}
