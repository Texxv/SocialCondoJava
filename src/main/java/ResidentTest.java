import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ResidentTest {
    @Test

    public void isLoggedInTest(){
        Resident r1 = new Resident();
        Date dateLogin = new Date();

        boolean isLogged = r1.isLoggedIn();

        assertEquals(false, isLogged);


    }
}