package io.intellij.examples.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LifeCycleMain
 *
 * @author tech@intellij.io
 */
public class LifeCycleMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		PersonBean personBean = (PersonBean) context.getBean("personBean");
		personBean.work();
		context.close();
	}

}
