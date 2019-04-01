import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director ("James Bond", "SE 098765", 100000, "The only one", 200000);
    }

    @Test
    public void canHaveBudget() {
        assertEquals(200000, director.getBudget(),0.1);
    }

    @Test
    public void canHaveName() {
        assertEquals("James Bond", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("SE 098765", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasdepartmentName() {
        assertEquals("The only one", director.getDeptName());
    }
    @Test
    public void hasSalaryRaise() {
        director.raiseSalary(30000.00);
        assertEquals(130000, director.getSalary());
    }
    @Test
    public void hasPayBonus() {
        assertEquals(2000.00,director.payBonus(),0.01);
    }
    @Test
    public void canChangeName() {
    director.setName("Robert Fleming");
    assertEquals("Robert Fleming", director.getName());
    }

    @Test
    public void cannotChangeNameWhenNull() {
        director.setName(null);
        assertEquals("James Bond", director.getName());
    }

}
