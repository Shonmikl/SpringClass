package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet pet = new Cat();
        Pet pet = context.getBean("myPet", Pet.class);
        System.out.println(pet);

        Person person = context.getBean("myPerson", Person.class);
        person.getAge();
        person.say();

        context.close();
    }
}