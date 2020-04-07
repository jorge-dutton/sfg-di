package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import guru.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// The run method returns an ApplicationContext
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// We can ask the Context for an instance of MyController, we never call
		// the
		// new on MyController to create an instance. The instance, was created
		// upon passing through the Controllers class, and when we ask Spring
		// to getBean the instance is grabbed from the Spring Application
		// Context
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

	}

}
