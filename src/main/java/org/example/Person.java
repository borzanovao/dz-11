package org.example;

public abstract class Person {
    private final String firstName;
    private String lastName;
    private Integer age;
    private Person partner;
    private final Sex sex;
    private Boolean isRegisterPartnership = false;

    public Person(String firstName, String lastName, Integer age, Person partner, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract Boolean isRetired();

    public void registerPartnership(Person partner) {
        if (!isRegisterPartnership) {
            this.partner = partner;
            isRegisterPartnership = true;
            partner.registerPartnership(this);
        }
    }

    public void deregisterPartnership(Boolean isLeavePartnerSurname) {
        if (isRegisterPartnership) {
            isRegisterPartnership = false;
            partner.deregisterPartnership(isLeavePartnerSurname);
            this.partner = null;
        }
    }

    @Override
    public String toString() {
        return "First Name - " + firstName + ", Last Name - " + getLastName() + ", Retired - " + isRetired() + ", Partnership - " + isRegisterPartnership;
    }
}