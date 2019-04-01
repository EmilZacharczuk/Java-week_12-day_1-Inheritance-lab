import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;
    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("John Petty", "SE 123456", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("John Petty", databaseAdmin.getName());
    }
    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("SE 123456", databaseAdmin.getNationalInsuranceNumber());
    }
    @Test
    public void hasSalary() {
        assertEquals(30000, databaseAdmin.getSalary());
    }
    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(3000.00);
        assertEquals(33000, databaseAdmin.getSalary());
    }
    @Test
    public void cannotHaveSalaryRiseWithNegative() {
        databaseAdmin.raiseSalary(-3000.00);
        assertEquals(30000, databaseAdmin.getSalary());
    }
    @Test
    public void hasBonus() {
        assertEquals(300, databaseAdmin.payBonus(),0.1);
    }
    @Test
    public void canChangeName() {
        databaseAdmin.setName("Robert Fleming");
        assertEquals("Robert Fleming", databaseAdmin.getName());
    }

    @Test
    public void cannotChangeNameWhenNull() {
        databaseAdmin.setName(null);
        assertEquals("John Petty", databaseAdmin.getName());
    }
}
