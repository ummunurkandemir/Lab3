
public class Address {
	private String streetName;
	private String town;
	private String city;
	
	public Address(String streetName,String town,String city) {
		this.streetName=streetName;
		this.town=town;
		this.city=city;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void display() {
		System.out.println("Street Name: "+this.streetName+ " Town: "+this.town+" City: "+this.city);
	}
}
