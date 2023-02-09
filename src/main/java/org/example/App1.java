package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat c1 = context.getBean("cat", Cat.class);
        Cat c2 = context.getBean("cat", Cat.class);


        context.close();
    }
}