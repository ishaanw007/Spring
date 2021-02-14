package com.ncu.cricket;

public class Adress implements Coach{
	private String Hno;
	@Override
	public String toString() {
		return "Adress [Hno=" + Hno + ", Sector=" + Sector + ", City=" + City + "]";
	}

	private String Sector;
	private String City;
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

	public String getHno() {
		return Hno;
	}

	public void setHno(String hno) {
		Hno = hno;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

}
