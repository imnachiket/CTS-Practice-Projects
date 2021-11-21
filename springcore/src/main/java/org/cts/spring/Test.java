package org.cts.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("org/cts/spring/config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println("Id: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Dept Ids: "+ emp.getDeptId());
        System.out.println("Map: "+emp.getMap());

        ClassPathXmlApplicationContext ctx2=new ClassPathXmlApplicationContext("org/cts/spring/config.xml");
        Department dept=(Department) ctx2.getBean("dept");

        System.out.println("Dept: "+dept.getList());
    }
}

