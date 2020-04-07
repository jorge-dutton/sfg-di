package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

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
		System.out.println("----------------- Primary Bean DI");
		System.out.println(myController.sayHello());

		// Starting here we can see how Spring manages DI
		System.out.println("----------------- property DI");
		// Next sentence will throw NoSuchBeanDefinitionException if the
		// controller class has not
		// been annotated as Spring componente ie @Controller
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");

		// Next sentence will throw a NullPointerException because the instance
		// of GreetingService
		// into the Controller has not been properly injected. We have to
		// annotate GreetingService
		// from PropertyOmjectedController as @Autowired
		// we'll have another error stating that Spring Boot was unable to start
		// if
		// GreetingServiceImpl is not annotated as a Spring Component
		// ie @Service
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------- setter DI");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------------- constructor DI");
		// In Spring 5 there's no need to annotate constructors as Autowired for
		// the constructor
		// DI base to work properly
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
