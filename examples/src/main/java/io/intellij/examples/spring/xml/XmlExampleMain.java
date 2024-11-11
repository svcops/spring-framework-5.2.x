package io.intellij.examples.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XmlExampleMain
 *
 * @author tech@intellij.io
 */
public class XmlExampleMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		XmlExampleBean bean = context.getBean(XmlExampleBean.class);

		System.out.println(bean);
	}
}
