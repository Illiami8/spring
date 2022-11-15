package com.whitePages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WhitePagesDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com");

        Human human = ctx.getBean("human",Human.class);
        System.out.println(human);
    }
}
