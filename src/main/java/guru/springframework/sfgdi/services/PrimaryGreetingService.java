package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * We keep this for the manual DI proof of concept
 * 
 * @author jorge.dutton
 *
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Say hello world! - Primary";
	}

}
