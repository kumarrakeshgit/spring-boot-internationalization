package io.rakesh.springbootstarter.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@RequestMapping("/customers")
	public String getAllCustomer() {
		return "All Customer";
	}

}
