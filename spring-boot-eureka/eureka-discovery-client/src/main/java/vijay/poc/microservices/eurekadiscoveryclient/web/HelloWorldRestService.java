package vijay.poc.microservices.eurekadiscoveryclient.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestService {

	@RequestMapping("/sayHello")
	public String sayHello() {
		System.out.println("Request Received");
		return "Hello, World!";
	}

}
