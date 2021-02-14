package com.ncu.cricket;

public class TennisCoach implements Coach {
    private String roll;
	@Override
	public String toString() {
		return "TennisCoach [roll=" + roll + ", ifortune=" + ifortune + "]";
	}
	//define a private field for dependency
	private IFortune ifortune;
	public TennisCoach(IFortune ifortune) {
		this.ifortune=ifortune;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice batting 15hrs daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}

}
