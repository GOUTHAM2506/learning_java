class Father { //Parent Class
	double money = 1000;
	String scooty = "Activa";
}

class Son extends Father { //Child Class with inheritance of Parent Class
	String phone = "Samsung";
	boolean hasGf = true;
}

class SingleLevel {
	public static void main(String[] args) 
	{
		Son s1 = new Son();
		System.out.println(s1.phone);
		System.out.println(s1.hasGf);
		System.out.println(s1.money);
		System.out.println(s1.scooty);
		System.out.println("----------------");
		Father f1 = new Father();
		System.out.println(f1.money);
		System.out.println(f1.scooty);
		//System.out.println(f1.phone); not possible
		//System.out.println(f1.hasGf); not possible
	}
}
