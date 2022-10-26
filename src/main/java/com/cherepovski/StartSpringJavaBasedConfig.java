package com.cherepovski;

import com.cherepovski.config.JavaasedConfiguration;
import com.cherepovski.model.Group;
import com.cherepovski.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartSpringJavaBasedConfig {
    public static void main(String[] args) {
        ApplicationContext clx = new AnnotationConfigApplicationContext("com");

        Group java = clx.getBean("java",Group.class);
        java.print();

       // Student jong = clx.getBean("jong",Student.class);
        //jong.print();
    }
}
