package io.intellij.examples.spring.aop;

/**
 * MyAspect
 *
 * @author tech@intellij.io
 */
public class AspectExample {
	public void beforeMethod() {
		System.out.println("方法执行前……");
	}

	public void afterMethod() {
		System.out.println("方法执行后……");
	}
}
