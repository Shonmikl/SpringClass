package org.example;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    public void say() {
        System.out.println("DoG Bow");
    }
}
