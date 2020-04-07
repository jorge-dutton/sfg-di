package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/*
 * We are asking Spring to create a new instance for this class
 * and Spring is going to call the new and store this instance
 * into de Spring Application Context...
 * 
 * */
@Controller
public class MyController {

	public String sayHello() {
		System.out.println("Hello world");

		return "Hi folks!";
	}
}
