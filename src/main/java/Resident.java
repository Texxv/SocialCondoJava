

import java.util.Date;

public class Resident {
	
	public String name;
	public String picture;
	public Date lastLoginDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public boolean isLoggedIn() {
		return lastLoginDate != null;
		
	}
	
}
