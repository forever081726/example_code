package com.homework.ruigou;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webconfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/**")
		        .allowedOrigins("*")
		        .allowedMethods("*")
		        .allowedHeaders("*")
		        .maxAge(36000);
	}

}
