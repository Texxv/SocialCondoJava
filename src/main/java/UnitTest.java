import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UnitTest {
    @Test
    public void getResidentsNamesTest(){


        Resident resident1 = new Resident();
        Resident resident2 = new Resident();
        Unit unit1 = new Unit();

        resident1.setName("Arthur");
        resident2.setName("Bruno");
        unit1.addResident(resident1);
        unit1.addResident(resident2);

        List<String> listName = unit1.getResidentsNames();

        assertEquals("Arthur", listName.get(0));
        assertEquals("Bruno", listName.get(1));

    }

    @Test
    public void numberOfResidentsEqualsZero(){

        Unit u1 = new Unit();

        int numberOfResidents = u1.numberOfResidents();

        assertEquals(0, numberOfResidents);
    }
    @Test
    public void numberOfResidentsEqualsOne(){

        Unit u1 = new Unit();
        Resident r1 = new Resident();

        u1.addResident(r1);

        int numberOfResidents = u1.numberOfResidents();

        assertEquals(1, numberOfResidents);
    }
    @Test
    public void residentsLoggedInEqualsZero(){

        Unit u1 = new Unit();
        Resident r1 = new Resident();
        Date dateLogin = new Date();
        r1.setLastLoginDate(dateLogin);

        int numberOfResidentsLoggedIn = u1.getResidentsLoggedIn();

        assertEquals(0, numberOfResidentsLoggedIn);
    }
    @Test
    public void residentsLoggedInEqualsOne(){

        Unit u1 = new Unit();
        Resident r1 = new Resident();
        Date dateLogin = new Date();
        r1.setLastLoginDate(dateLogin);
        u1.addResident(r1);

        int numberOfResidentsLoggedIn = u1.getResidentsLoggedIn();

        assertEquals(1 , numberOfResidentsLoggedIn);
    }

}