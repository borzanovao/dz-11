package org.example;

public class Woman extends Person {

    private String maidenLastName;

    public Woman(String firstName, String lastName, Integer age, Person partner) {
        super(firstName, lastName, age, partner, Sex.FEMALE);
    }

    @Override
    public Boolean isRetired() {
        return getAge() >= 60;
    }

    @Override
    public void registerPartnership(Person partner) {
        this.maidenLastName = getLastName();
        setLastName(partner.getLastName());
        super.registerPartnership(partner);
    }

    @Override
    public void deregisterPartnership(Boolean isLeavePartnerLastName) {
        super.deregisterPartnership(isLeavePartnerLastName);
        if (!isLeavePartnerLastName) {
            setLastName(maidenLastName);
        }
    }
}
