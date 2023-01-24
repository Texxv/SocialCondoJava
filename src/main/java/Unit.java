

import java.util.ArrayList;

import java.util.List;

public class Unit {
	
	private String name;
	private List<Resident> residents = new ArrayList<>();
	

	IEngagementStrategy engagementStrategy;
	public Unit(IEngagementStrategy engagementStrategy){
		this.engagementStrategy = engagementStrategy;
	}

	public int countResidentsLoggedIn(){
		return engagementStrategy.countResidentsLoggedIn(this.residents);
	}

	public List<String> getResidentsNames(){
		List<String> residentsNames = new ArrayList<>();
		for(int i = 0; i < residents.size(); i++) {
			residentsNames.add(residents.get(i).getName());
		}
		return residentsNames;
	}
	public int numberOfResidents() {
		return residents.size();
	}
	public int getResidentsLoggedIn() {
		
		int counterOfResidentsLoggedIn = 0;
		
		for(int i = 0; i < residents.size(); i++) {	
			if(residents.get(i).isLoggedIn()){
				counterOfResidentsLoggedIn++;
			}
		}
		
		return counterOfResidentsLoggedIn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Resident> getResidents() {
		return residents;
	}
	public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}
	public void addResident(Resident resident) {
		residents.add(resident);
	}
	

}
