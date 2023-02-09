package org.example;

import org.springframework.stereotype.Component;

import java.util.Random;

//@Component("cat")
public class Cat implements Pet {
    private String name;
    public Cat() {
        System.out.println("Cat constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("CaT MeoW");
    }

    public void init() {
        System.out.println("INIT");
    }

    public void destroy() {
        System.out.println("DESTROY");
    }
}