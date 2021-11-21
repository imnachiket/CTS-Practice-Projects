package org.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SocketUtils;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/beanscopes/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp.hashCode());

		Employee emp2 = (Employee) ctx.getBean("emp");
		System.out.println(emp2.hashCode());

	}
}
