public class StartGrading {	
	public static void testMammal() {
		Mammal m = new Mammal("some name");
		System.out.println(m.getName() == "some name");
		System.out.println(m.isCookable() == false); // Message printed too.
	}

	public static void testHuman() {
		Human h = new Human();
		// getName is inherited from Mammal.
		System.out.println(h.getName() == "Alice");
		System.out.println(h.isCookable() == false);  // No message printed.
	}


	public static void testRabbit() {
		Rabbit r = new Rabbit("Bugs Bunny", 20.0);
		// getName is inherited from Mammal.
		System.out.println(r.getName() == "Bugs Bunny");
		System.out.println(r.getWeight() == 20.0);
		System.out.println(r.isCookable() == true);
	}


	public static void testEuropeanRabbit() {
		// Testing the first constructor.
		EuropeanRabbit er1 = new EuropeanRabbit("black bunny", 3.0);
		// getName is inherited from Mammal.
		System.out.println(er1.getName() == "black bunny");
		// getWeight is inherited from Rabbit.
		System.out.println(er1.getWeight() == 3.0);
		// isCookable is inherited from Rabbit.
		System.out.println(er1.isCookable() == true);
		// Testing the second constructor.
		EuropeanRabbit er2 = new EuropeanRabbit("white rabbit");
		// getName is inherited from Mammal.
		System.out.println(er2.getName() == "white rabbit");
		// getWeight is inherited from Rabbit.
		System.out.println(er2.getWeight() == 2.0);
		// isCookable is inherited from Rabbit.
		System.out.println(er2.isCookable() == true);
	}

	public static void testLapinSauteChasseur() {
		LapinSauteChasseur lsc = new LapinSauteChasseur();
		// getName is inherited from Mammal.
		System.out.println(lsc.getName() == "Delicious");
		// getWeight is inherited from Rabbit.
		System.out.println(lsc.getWeight() == 0.5);
		// isCookable is inherited from Rabbit.
		System.out.println(lsc.isCookable() == true);
	}
	

	public static void testFrankTheRabbit() {
		FrankTheRabbit ftr = new FrankTheRabbit();
		// getName is inherited from Mammal.
		System.out.println(ftr.getName() == "Frank");
		// getWeight is inherited from Rabbit.
		System.out.println(ftr.getWeight() == 100.0);
		// isCookable is from FrankTheRabbit itself.
		System.out.println(ftr.isCookable() == false);
	}

	public static void main(String[] args) {
		testMammal();
		testHuman();
		testRabbit();
		testEuropeanRabbit();
		testLapinSauteChasseur();
		testFrankTheRabbit();
	}

}
