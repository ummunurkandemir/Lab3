import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	// Question 2 (Euclidean distance)
	public static double findsEuclideanDist() {
		Point p1=new Point(2, 1);
		Point p2=new Point(6, 4);
		return Math.sqrt((Math.pow(p2.getX()-p1.getX(), 2)+Math.pow(p2.getY()-p1.getY(), 2)));
	}
	
	// Question 3 (Convert Clock)
	public static void convertClock() {
		Clock c1=new Clock("14:50");
		Clock c2=new Clock("01:40");
		c1.convert();
		c2.convert();
	}
	
	// Question 4 (Real Estate Agent)
	public static void realEstateAgent() {
		Scanner sc=new Scanner(System.in);
		Address realEstateAddress=new Address("Civan", "Buca", "Ýzmir");
		ArrayList<House> houseList=new ArrayList<House>();
		RealEstate realEstate=new RealEstate("Ummunur Kandemir RE",realEstateAddress, houseList);
		while(true) {
			System.out.println("-------------------------------------------------\r\nMenu\r\n1- Add a house\r\n" + 
					"2- Display all houses\r\n" + 
					"3- Search by price\r\n" + 
					"4- Exit\r\n-------------------------------------------------"
			);
			
			int select=sc.nextInt();
			if(select==1) {
				realEstate.addHouse();
			}
			else if(select==2) {
				realEstate.displayAllHouses();
			}
			else if(select==3) {
				System.out.println("Less Valuable: ");
				int price1=sc.nextInt();
				System.out.println("More Valuable: ");
				int price2=sc.nextInt();
				realEstate.searchByPrice(price1, price2);
			}
			else if(select==4) {
				break;
			}
			else System.out.println("invalid input");
		}
	}
	public static void main(String[] args) {
		
		// Question 2
		//System.out.println(findsEuclideanDist());
		
		// Question 3
		//convertClock();
		
		// Question 4
		realEstateAgent();
	}
	

}
