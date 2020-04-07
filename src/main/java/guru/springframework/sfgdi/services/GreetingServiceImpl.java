package guru.springframework.sfgdi.services;

/**
 * We keep this for the manual DI proof of concept
 * 
 * @author jorge.dutton
 *
 */
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Say hello world!";
	}

}
