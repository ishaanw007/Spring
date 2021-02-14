package collection;

public class Address {
	private String Hno;
	@Override
	public String toString() {
		return "Address [Hno=" + Hno + ", Sector=" + Sector + ", City=" + City + "]";
	}

	private String Sector;
	private String City;
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
}
