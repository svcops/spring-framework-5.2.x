package io.intellij.examples.spring.aop;

import io.intellij.examples.spring.xml.XmlExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AopMain
 *
 * @author tech@intellij.io
 */
public class AopMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-aop.xml");

		XmlExampleBean bean = context.getBean(XmlExampleBean.class);

		bean.sayHello();
	}
}
