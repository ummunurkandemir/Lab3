
public class House {
	private String kind;
	private int numberOfRooms;
	private Address address;
	private int area;
	private int price;
	private static int numOfHouses;
	public House(String kind,int numberOfRooms, Address address,int area,int price) {
		this.kind=kind;
		this.numberOfRooms=numberOfRooms;
		this.address=address;
		this.area=area;
		this.price=price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumOfHouses() {
		return numOfHouses;
	}
	public void setNumOfHouses(int numOfHouses) {
		this.numOfHouses = numOfHouses;
	}

	public void display() {
		System.out.println("Kind:"+this.kind+" Number Of Rooms:"+this.numberOfRooms+" Address: street name:"+this.address.getStreetName()+" town:"+
		this.address.getTown()+" city:"+this.address.getCity()+" Area:"+this.area+" Price:"+this.price);
	}
}
