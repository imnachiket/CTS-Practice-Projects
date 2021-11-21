package org.spring.xmlcongif;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("org/spring/xmlcongif/config2.xml");
        Patient patient = (Patient) ctx.getBean("patient");
        System.out.println("Patient:"+ patient.getId());
        ctx.close();
    }
}
