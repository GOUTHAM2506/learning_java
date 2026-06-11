import java.util.Scanner;
class Ride {
	String pickup;
	String drop;
	int distance;
	Ride(String pickup, String drop, int distance) {
		this.pickup = pickup;
		this.drop = drop;
		this.distance = distance;
	}
}

class Car extends Ride {
	int price = 50;
	Car(String pickup, String drop, int distance) {
		super(pickup, drop, distance);
	}
	void carDetails() {
		System.out.println("You have booked Car! Here is your ride!!");
		System.out.println(pickup+" -> "+drop);
		System.out.println("Distance is : "+distance+" km");
		System.out.println("Total Amount : "+(distance*price));
	}
}

class Bike extends Ride {
	int price = 20;
	Bike(String pickup, String drop, int distance) {
		super(pickup, drop, distance);
	}
	void bikeDetails() {
		System.out.println("You have booked Bike! Here is your ride!!");
		System.out.println(pickup+" -> "+drop);
		System.out.println("Distance is : "+distance+"km");
		System.out.println("Total Amount : "+(distance*price));
	}
}

class Auto extends Ride {
	int price = 30;
	Auto(String pickup, String drop, int distance) {
		super(pickup, drop, distance);
	}
	void autoDetails() {
		System.out.println("You have booked Auto! Here is your ride!!");
		System.out.println(pickup+" -> "+drop);
		System.out.println("Distance is : "+distance+"km");
		System.out.println("Total Amount : "+(distance*price));
	}
}

class Rapido
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\n\tWelcome to Rapido!!\n1.Car\n2.Bike\n3.Auto\nEnter your vehicle option : ");
		int opt = sc.nextInt();
		
		String pickup;
		String drop;
		int distance;
		
		Ride r = null;
		
		switch(opt) {
			case 1:	System.out.print("Enter your pickup : ");
					pickup = sc.next();
					System.out.print("Enter your drop : ");
					drop = sc.next();
					System.out.print("Enter the distance : ");
					distance = sc.nextInt();
					r = new Car(pickup, drop, distance);
					break;
			case 2:	System.out.print("Enter your pickup : ");
					pickup = sc.next();
					System.out.print("Enter your drop : ");
					drop = sc.next();
					System.out.print("Enter the distance : ");
					distance = sc.nextInt();
					r = new Bike(pickup, drop, distance);
					break;
			case 3:	System.out.print("Enter your pickup : ");
					pickup = sc.next();
					System.out.print("Enter your drop : ");
					drop = sc.next();
					System.out.print("Enter the distance : ");
					distance = sc.nextInt();
					r = new Auto(pickup, drop, distance);
					break;
			default:
					System.out.println("Enter a valid option.");
		}
		System.out.println("---------------------------------------------");
		if(r instanceof Car) {
			Car c = (Car) r;
			c.carDetails();
		}
		if(r instanceof Bike) {
			Bike b = (Bike) r;
			b.bikeDetails();
		}
		if(r instanceof Auto) {
			Auto a = (Auto) r;
			a.autoDetails();
		}
	}
}
