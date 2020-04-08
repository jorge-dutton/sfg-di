package guru.springframework.sfgdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
		implements
			InitializingBean,
			DisposableBean,
			BeanNameAware,
			BeanFactoryAware,
			ApplicationContextAware {

	public LifeCycleDemoBean() {
		super();
		System.out.println("## I am in the LifeCycleBean constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## The Application context has been set");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## Bean factory has been set");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## My bean name is " + name);

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## The LifeCycle bean has terminated");

	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("## The PostConstruct annotated method has been called");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("## The Predestroy annotated method has been called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## the bean has his properties set");

	}

	public void beforeInit() {
		System.out.println("## ************* Before Init - Called by Bean Post Processor");
	}

	public void afterInit() {
		System.out.println("## ************* After init - Called by Bean Post Processor");
	}

}
