import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("John Petty", "SE 123456", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("John Petty", developer.getName());
    }
    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("SE 123456", developer.getNationalInsuranceNumber());
    }
    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary());
    }
    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(3000.00);
        assertEquals(33000, developer.getSalary());
    }

    @Test
    public void hasBonus() {
        assertEquals(300, developer.payBonus(),0.1);
    }
    @Test
    public void canChangeName() {
        developer.setName("Robert Fleming");
        assertEquals("Robert Fleming", developer.getName());
    }

    @Test
    public void cannotChangeNameWhenNull() {
        developer.setName(null);
        assertEquals("John Petty", developer.getName());
    }
}
