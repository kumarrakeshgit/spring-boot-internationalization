package io.rakesh.springbootstarter;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
	
	@Bean
	public LocaleResolver localResolver() {
		//below class accept the local from request header, we can use sessionLocalResolver as well but...
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}

	//we can set the below properties in the application.properties instead of this method
	@Bean
	public ResourceBundleMessageSource bundleMessagesource() {
		ResourceBundleMessageSource msg = new ResourceBundleMessageSource();
		msg.setBasename("messages");
		return msg;
	}
	
	
}
