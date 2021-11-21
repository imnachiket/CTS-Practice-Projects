package org.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("org/constructorinjection/config.xml");
        Employee emp=(Employee)ctx.getBean("emp");
        Address add=(Address) ctx.getBean("add");
        System.out.println(emp);
        System.out.println(add);
    }
}
