package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import guru.springframework.sfgdi.services.GreetingService;

/**
 * Example of manual DI by property. Not the preferred method anyway
 * 
 * @author jorge.dutton
 *
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingService; // Property's got to be public,
											// there're nasty things involving
											// private injected propeties

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
