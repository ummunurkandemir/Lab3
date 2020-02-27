import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RealEstate {
	private String agentName;
	private Address agentAddress;
	private ArrayList<House> house_list;
	public RealEstate(String agentName,Address agentAddress, ArrayList<House> house_list) {
		this.agentName=agentName;
		this.agentAddress=agentAddress;
		this.house_list=house_list;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public Address getAgentAddress() {
		return agentAddress;
	}
	public void setAgentAddress(Address agentAddress) {
		this.agentAddress = agentAddress;
	}
	public ArrayList<House> getHouse_list() {
		return house_list;
	}
	public void setHouse_list(ArrayList<House> house_list) {
		this.house_list = house_list;
	}
	public void addHouse() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter kind:");
			String kind=sc.nextLine();
			System.out.println("Enter the number of rooms:");
			int numOfRooms=Integer.parseInt(sc.nextLine());
			System.out.println("Enter street name:");
			String streetName=sc.nextLine();
			System.out.println("Enter town:");
			String town=sc.nextLine();
			System.out.println("Enter city:");
			String city=sc.nextLine();
			System.out.println("Enter area:");
			int area=Integer.parseInt(sc.nextLine());
			System.out.println("Enter price:");
			int price=Integer.parseInt(sc.nextLine());
			Address address=new Address(streetName, town, city);
			House newHouse=new House(kind, numOfRooms, address, area, price);
			this.house_list.add(newHouse);
			
		}
		catch(Exception e) {
			System.out.println("Invalid input");
		}
	}
	
	public void displayAllHouses() {
		for (int i = 0; i < house_list.size(); i++) {
			System.out.println("House "+(i+1)+":");
			house_list.get(i).display();
		}
	}
	
	public int getNumHouses() {
		return house_list.size();
	}
	public void searchByPrice(int lessPrice,int morePrice) {
		boolean flag=false;
		for (int i = 0; i <house_list.size(); i++) {
			if(house_list.get(i).getPrice()<=morePrice && house_list.get(i).getPrice()>=lessPrice) {
				house_list.get(i).display();
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Cant find house");
		}
	}
}
