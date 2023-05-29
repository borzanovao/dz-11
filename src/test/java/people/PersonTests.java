package people;

import org.example.Person;
import org.example.Sex;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonTests {
    private Person person;
    private final static int AGE = 7;

    @BeforeTest
    public void creatingPerson() {
        person = new Person("Pasha", "Pavlov", AGE, null, Sex.MALE) {
            @Override
            public Boolean isRetired() {
                return null;
            }
        };
    }

    @Test
    public void testSetGetAge() {
        Assert.assertEquals(person.getAge(), AGE, "Gotten age is not equal");
        person.setAge(9);
        Assert.assertEquals(person.getAge(), 9, "Set age is not equal");
    }

    @Test
    public void testSetGetLastName() {
        Assert.assertEquals(person.getLastName(), "Pavlov", "Gotten Last Name is incorrect");
        person.setLastName("Ivanov");
        Assert.assertEquals(person.getLastName(), "Ivanov", "Set Last Name is incorrect");
    }
}
