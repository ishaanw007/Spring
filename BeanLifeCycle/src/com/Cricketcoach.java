package com;



public class Cricketcoach implements Coach{
private String email;
private String team_name;
private String name;
private IFortune ifortune;
public Cricketcoach(String name) {
	this.name=name;
	System.out.println(name);

}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
public String toString() {
	return"Cricketcoach name="+team_name+",emailid="+email+"";
}
void initmethod() {
	System.out.println("this is the first method");
}
void destroymethod() {
	System.out.println("this is destro method");
}

public IFortune getIfortune() {
	return ifortune;
}

public void setIfortune(IFortune ifortune) {
	System.out.println("dependency injection");
	this.ifortune = ifortune;
}
}
