import java.util.Scanner;
class Circle 
{
	final double PI;
	
	Circle() {
		this.PI = 3.14;
	}
	
	public static void area(int r) {
		Circle c1 = new Circle();
		double ans = c1.PI*r*r;
		System.out.println("Area of the circle : "+ans);
	}
	
	public static void periMeter(int r) {
		Circle c1 = new Circle();
		double ans = 2*c1.PI*r;
		System.out.println("Perimeter of the circle is : "+ans);
	}
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter radius : ");
		int r = sc.nextInt();
		area(r);
		periMeter(r);
	}
}
