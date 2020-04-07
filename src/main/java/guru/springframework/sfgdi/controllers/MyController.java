package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import guru.springframework.sfgdi.services.GreetingService;

/*
 * We are asking Spring to create a new instance for this class
 * and Spring is going to call the new and store this instance
 * into de Spring Application Context...
 * 
 * */
@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
