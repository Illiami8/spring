package com.cherepovski;

import com.cherepovski.model.Group;
import com.cherepovski.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class StartSpringXmlSimple {
    public static void main(String[] args) {
        ConfigurableApplicationContext clx = new ClassPathXmlApplicationContext("beans.xml");
        clx.registerShutdownHook();
        //   Student jong = clx.getBean("jong", Student.class);
        // Student bob = clx.getBean("bob", Student.class);

        //      jong.print();
//        bob.print();

        Group java = clx.getBean("java", Group.class);
        java.print();
        Student anna = java.getStudents().get(2);
        anna.print();

        Group elGroup = clx.getBean("elGroup", Group.class);
        elGroup.print();
        // if(true){
      //      throw new RuntimeException();
      //  }
//clx.close();

    }
}
