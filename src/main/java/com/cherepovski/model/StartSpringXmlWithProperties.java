package com.cherepovski.model;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartSpringXmlWithProperties {
    public static void main(String[] args) {
        ConfigurableApplicationContext clx = new ClassPathXmlApplicationContext("beans-with-properties.xml");
        clx.registerShutdownHook();

        Group java = clx.getBean("java", Group.class);
        java.print();

    }
}
