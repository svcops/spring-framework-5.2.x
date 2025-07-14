package io.intellij.examples.spring.xml;

import lombok.Data;
import lombok.ToString;

/**
 * ExampleBean
 *
 * @author tech@intellij.io
 */
@ToString
@Data
public class XmlExampleBean {
	private String propertyName;

	public void sayHello() {
		System.out.println("Hello from XmlExampleBean!");
	}

}
