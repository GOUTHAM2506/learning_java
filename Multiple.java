interface Father {
	int money = 1000;
}

class Mother {
	int extraMoney = 2000;
}

class Child extends Mother implements Father{
}

class Multiple {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Child c1 = new Child();
		System.out.println(c1.money);
		System.out.println(c1.extraMoney);
	}
}
