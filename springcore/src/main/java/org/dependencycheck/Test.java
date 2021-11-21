package org.dependencycheck;

import org.spring.xmlcongif.Patient;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("org/dependencycheck/config2.xml");
        Prescription prescription = (Prescription) ctx.getBean("prescription");

        System.out.println(prescription);

    }
}
