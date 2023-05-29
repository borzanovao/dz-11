package org.example;

public class Man extends Person {

    public Man(String firstName, String lastName, Integer age, Person partner) {
        super(firstName, lastName, age, partner, Sex.MALE);
    }

    @Override
    public Boolean isRetired() {
        return getAge() >= 65;
    }
}

