package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Example of manual DI by property. Not the preferred method anyway
 * 
 * @author jorge.dutton
 *
 */
public class PropertyInjectedController {
	public GreetingService greetingService; // Property's got to be public,
											// there're nasty things involving
											// private injected propeties

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
