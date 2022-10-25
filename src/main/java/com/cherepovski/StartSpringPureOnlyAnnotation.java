package com.cherepovski;

import com.cherepovski.model.Group;
import com.cherepovski.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartSpringPureOnlyAnnotation {
    public static void main(String[] args) {
        ApplicationContext clx = new AnnotationConfigApplicationContext();


        Group java = clx.getBean("java", Group.class);
        java.print();


    }
}
