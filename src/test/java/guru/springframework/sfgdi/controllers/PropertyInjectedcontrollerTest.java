package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import guru.springframework.sfgdi.services.GreetingServiceImpl;

/**
 * This test is used to demonstrate DI without Spring and it mimics what is
 * actually been done into the Spring Framework
 * 
 * @author jorge.dutton
 *
 */
public class PropertyInjectedcontrollerTest {
	PropertyInjectedController propertyInjectedController;

	@BeforeEach
	void setUp() {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	void getGreeting() {
		System.out.println(propertyInjectedController.getGreeting());
	}
}
