

import java.util.ArrayList;

import java.util.List;

public class Community {

	private String name;
	private String address;
	private TypeOfHousing type;
	private List<Unit> units = new ArrayList<>();

	public List<String> getCommunityResidentsNames() {
		List<String> residentsNames = new ArrayList<>();
		for (int i = 0; i < units.size(); i++) {
			residentsNames.addAll(units.get(i).getResidentsNames());
		}
		return residentsNames;
	}

	public float getResidentsLoggedInPercentage() throws DivisionByZeroException {

		int totalOfResidents = 0;
		int residentsLoggedIn = 0;

		for (int i = 0; i < units.size(); i++) {
			Unit unit = units.get(i);
			totalOfResidents = totalOfResidents + unit.numberOfResidents();
			residentsLoggedIn = residentsLoggedIn + unit.getResidentsLoggedIn();
		}
		if (totalOfResidents == 0) {
			throw new DivisionByZeroException("O condominio " + name + " tem 0 residents");
		}
		return (residentsLoggedIn * 100) / totalOfResidents;
		
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public void addUnit(Unit unit) {
		units.add(unit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TypeOfHousing getType() {
		return type;
	}

	public void setType(TypeOfHousing type) {
		this.type = type;
	}

}
