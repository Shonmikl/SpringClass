package org.example;

import lombok.ToString;

@ToString
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat constructor");
    }

    @Override
    public void say() {
        System.out.println("CaT MeoW");
    }
}