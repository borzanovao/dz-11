package people;

import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FamilyTests {
    private Man men1;
    private Woman women1;

    @BeforeTest
    public void creatingFamily() {
        men1 = new Man("Alex", "Ovechko", 66, null);

        women1 = new Woman("Masha", "Ivanova", 60, null);
    }

    @Test
    public void testIsRetiredMen() {
        Assert.assertTrue(men1.isRetired(), "Men is not retired");
        men1.setAge(64);
        Assert.assertFalse(men1.isRetired(), "Men is retired");
    }

    @Test
    public void testIsRetiredWomen() {
        Assert.assertTrue(women1.isRetired(), "Women is not retired");
        women1.setAge(9);
        Assert.assertFalse(women1.isRetired(), "Women is retired");
    }
    @Test
    public void testRegisterPartnership(){
        men1.registerPartnership(women1);
        Assert.assertEquals(women1.getLastName(), "Ovechko");
    }
    @Test
    public void testDeregisterPartnership(){
        women1.deregisterPartnership(true);
        Assert.assertEquals(women1.getLastName(), "Ivanova");
    }
}
