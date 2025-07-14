package io.intellij.examples.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static io.intelliij.debug.logger.DebugLogger.getLogger;

/**
 * XmlExampleMain
 *
 * @author tech@intellij.io
 */
public class XmlExampleMain {
	public static void main(String[] args) {

		getLogger("XmlExampleMain").info("Starting XmlExampleMain");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		XmlExampleBean bean = context.getBean(XmlExampleBean.class);

		System.out.println(bean);
	}
}
