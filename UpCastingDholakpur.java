class Indravarma { //Parent Class
	void aboutIndravarma() {
		System.out.println("I am an useless king, I am fully dependent on Bheem and other kids.");
	}
}

class Raju extends Indravarma {
	void aboutRaju() {
		System.out.println("I have 2 hairs.");
	}
}

class Chutki extends Indravarma {
	void aboutChutki() {
		System.out.println("I give laddu to Bheem.");
	}
}

class Dholu extends Indravarma {
	void aboutDholu() {
		System.out.println("I do whatever Kalia tells.");
	}
}

class Bholu extends Indravarma {
	void aboutBholu() {
		System.out.println("I do whatever Kalia tells.");
	}
}

class UpCastingDholakpur {
	public static void main(String[] args) {
		Chutki c1 = new Chutki();
		c1.aboutChutki();
		c1.aboutIndravarma();
		System.out.println("----------------------------------------------------------------------");
		Indravarma i1 = new Chutki();
		i1.aboutIndravarma();
	}
}
