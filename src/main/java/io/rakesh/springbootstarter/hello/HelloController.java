package io.rakesh.springbootstarter.hello;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	ResourceBundleMessageSource messageSource;

	@RequestMapping("/hello")
	public String sayHello() {
		
		return "Hello All";
	}
	
	@RequestMapping("/helloWorld-internationalization")
	public String sayHelloWordIntern(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
		
		return messageSource.getMessage("morning.message",null, locale);
	}	

	@RequestMapping("/helloWorld-internationalization2")
	public String sayHelloWordIntern2() {
		return messageSource.getMessage("morning.message",null, LocaleContextHolder.getLocale());
	}	
	
	
}
