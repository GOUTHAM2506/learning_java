class Master {
	
	void Review() {
		System.out.println("\nMaster is a good movie");
	}
	
}
class Leo {
	
	String actorName;
	
	void songs() {
		System.out.println("\nBadass");
		System.out.println("Ordinary Person");
		System.out.println("Naa Ready");
	}
	
	public static void main(String[] args) {
		Master m1 = new Master();
		Leo l1 = new Leo();
		l1.actorName = "Vijay";
		System.out.println("The actor name is "+l1.actorName);
		l1.songs();
		m1.Review();
	}
	
}
