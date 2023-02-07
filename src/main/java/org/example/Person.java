package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class Person {
    private String name;
    private int age;
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person constructor");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    //pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Set Pet");
        this.pet = pet;
    }

    public void say() {
        System.out.println("SAY");
        pet.say();
    }
}