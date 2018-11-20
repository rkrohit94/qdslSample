package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SampleApplication.class, args);

	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/listTraining/*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/engineapi/v2/*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/engineapimeta/v2/*").allowedMethods("GET", "POST", "DELETE", "PUT");
				registry.addMapping("/engineapi/history/*").allowedMethods("GET", "POST", "DELETE", "PUT");
			}
		};
	}
}
