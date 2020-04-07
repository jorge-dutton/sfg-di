package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;// Best practice declare it
													// private final

	// @Autowired No need to annotate this for constructor based DI
	public ConstructorInjectedController(final GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
