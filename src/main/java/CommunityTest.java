import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CommunityTest {

    @Test
    public void getCommunityResidentsNamesTest() {
        Unit u1 = mock(Unit.class);
        Community c1 = new Community();

        c1.addUnit(u1);

        when(u1.getResidentsNames()).thenReturn(Collections.singletonList("Arthur"));

        List<String> result = c1.getCommunityResidentsNames();

        assertEquals("Arthur", result.get(0));

    }

    @Test
    public void residentsLoggedInPercentageTest() {

        Community community1 = new Community();

        Unit u1 = new Unit();

        Resident r1 = new Resident();
        Resident r2 = new Resident();
        Resident r3 = new Resident();
        Resident r4 = new Resident();

        Date dateLogin1 = new Date();

        r1.setName("Arthur");

        r1.setLastLoginDate(dateLogin1);
        r2.setLastLoginDate(dateLogin1);
        r3.setLastLoginDate(dateLogin1);
        r4.setLastLoginDate(null);

        u1.addResident(r1);
        u1.addResident(r2);
        u1.addResident(r3);
        u1.addResident(r4);

        community1.addUnit(u1);

        float percentageOfLoggedResidents = community1.getResidentsLoggedInPercentage();

        assertEquals(75, percentageOfLoggedResidents);
    }

    @Test
    public void getResidentsLoggedInThrowsException() {

        Resident r1 = new Resident();
        Unit u1 = new Unit();
        Community c1 = new Community();
        Date dateLogin = new Date();
        c1.setName("Alvorada");

        r1.setLastLoginDate(dateLogin);

        float percentageOfLoggedResidents = c1.getResidentsLoggedInPercentage();

        assertEquals(0, percentageOfLoggedResidents);


    }
}