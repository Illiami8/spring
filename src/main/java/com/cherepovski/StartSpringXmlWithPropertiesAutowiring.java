package com.cherepovski;

import com.cherepovski.model.Group;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartSpringXmlWithPropertiesAutowiring {
    public static void main(String[] args) {
        ConfigurableApplicationContext clx = new ClassPathXmlApplicationContext("beans-with-properties-autowiring.xml");
        clx.registerShutdownHook();

        Group java = clx.getBean("java", Group.class);
        java.print();

    }
}
