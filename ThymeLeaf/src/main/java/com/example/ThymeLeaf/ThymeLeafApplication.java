package com.example.ThymeLeaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeLeafApplication extends SpringBootServletInitializer {
	
	/*
	 * Used  when  run  as a JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(ThymeLeafApplication.class, args);
	}

	/*
	 * Used  when  run  as a WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ThymeLeafApplication.class);
	}
	
	

}
