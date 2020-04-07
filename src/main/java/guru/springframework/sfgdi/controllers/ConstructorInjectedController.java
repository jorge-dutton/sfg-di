package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;// Best practice declare it
													// private final

	public ConstructorInjectedController(final GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
