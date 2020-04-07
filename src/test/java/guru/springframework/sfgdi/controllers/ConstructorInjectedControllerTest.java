package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceImpl;

/**
 * This tests mimick's the DI by constructor behaviour
 * 
 * @author jorge.dutton
 *
 */
public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		final GreetingService greetingService = new GreetingServiceImpl();
		controller = new ConstructorInjectedController(greetingService);
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
