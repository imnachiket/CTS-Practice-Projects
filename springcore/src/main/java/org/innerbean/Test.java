package org.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/innerbean/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);

	}
}
