package com.cherepovski;

import com.cherepovski.config.JavaBasedConfiguration;
import com.cherepovski.model.Group;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartSpringPureOnlyAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBasedConfiguration.class);


        Group java = ctx.getBean("java", Group.class);
        java.print();


    }
}
