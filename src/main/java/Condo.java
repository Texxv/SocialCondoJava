
import java.util.Date;

public class Condo {

	public static void main(String[] args) throws DivisionByZeroException {
					
		Resident r1 = new Resident();
		Date dateLogin1 = new Date();		
		r1.setName("Joao");
		r1.setLastLoginDate(dateLogin1);
				
		Resident r2 = new Resident();
		r2.setLastLoginDate(dateLogin1);		
		r2.setName("pedro");
						
				
		
		Unit u1 = new Unit();
				
		u1.addResident(r1);
		u1.addResident(r2);

		Community c1 = new Community();
	
		c1.addUnit(u1);
			
			
		System.out.println(c1.getUnits());
		System.out.println(c1.getCommunityResidentsNames());
		try {
			System.out.println(c1.getResidentsLoggedInPercentage());
		}catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
		}
				
	}
}
