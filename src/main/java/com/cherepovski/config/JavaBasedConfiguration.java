package com.cherepovski.config;


import com.cherepovski.model.Employee;
import com.cherepovski.model.Group;
import com.cherepovski.model.Student;
import com.cherepovski.model.Teacher;
import com.cherepovski.model.qualifier.AlexQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("com")
@EnableWebMvc
public class JavaBasedConfiguration {
    @Bean
    InternalResourceViewResolver internalResourceViewResolver(@Autowired ApplicationContext ctx){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setApplicationContext(ctx);
        resolver.setPrefix("/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public Student jong(){
      return new Student(1,"Jong", Map.of("c",8,"j",9));
    }
    @Bean
    public Student bob(){
        Student student = new Student();
        student.setId(2);
        student.setName("Bob");
        student.setMarks( Map.of("c",8,"j",9));
        return student;
    }
    @Bean
    @AlexQualifier
    public Employee alex(){
        Teacher alex = new Teacher(1, "Alex", 1000);
        alex.setCertificates(List.of("Java","Cisco"));
        return alex;
    }
    @Bean
    public Group java(){
        Group javaEE = new Group(1, "JavaEE", List.of(jong(),bob()));
        return javaEE;
    }
}
//Отличие конструктора от параметров