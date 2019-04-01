import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before public void before() {
        manager = new Manager("Arnold Clark","SE 567890", 50000, "IT");
    }

    @Test
    public void hasName() {
        assertEquals("Arnold Clark", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("SE 567890", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, manager.getSalary());
    }
    @Test
    public void hasDepartment() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void hasSalaryRaise() {
        manager.raiseSalary(3000.00);
        assertEquals(53000, manager.getSalary());
    }
    @Test
    public void cannotHaveSalaryRiseWithNegative() {
        manager.raiseSalary(-3000.00);
        assertEquals(50000, manager.getSalary());
    }
    @Test
    public void hasPayBonus() {
        assertEquals(500.00,manager.payBonus(),0.01);
    }

    @Test
    public void canChangeName() {
        manager.setName("Robert Fleming");
        assertEquals("Robert Fleming", manager.getName());
    }

    @Test
    public void cannotChangeNameWhenNull() {
        manager.setName(null);
        assertEquals("Arnold Clark", manager.getName());
    }
}
