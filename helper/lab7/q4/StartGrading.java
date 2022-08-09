class StartGrading {	

	public static void main(String[] args) {
		testAnimal();
		testDog();
		testBird();
		testMagpie();
		
	}
	
	public static void testAnimal() {
		// Animal a = new Animal("Unknown"); // This does not work!
	}
	
	// Since the Dog class is not abstract, we can create objects from
	// the Dog class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class).
	public static void testDog() {
		Dog d = new Dog("Nice Doggy");
		// The getName method is inherited from Animal.
		// The getLegs and canFly methods come from Dog itself.
		System.out.println(d.getName() == "Nice Doggy");
		System.out.println(d.getLegs() == 4);
		System.out.println(d.canFly() == false);
	}
	
	public static void testBird() {
		// Bird b = new Bird("Twitter", 3); // This does not work!
	}
	
	// Since the Magpie class is not abstract, we can create objects from
	// the Magpie class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class and the getLegs and getNumOfEggs methods which are
	// inherited from the Bird class).
	public static void testMagpie() {
		Magpie m = new Magpie("Maggie");
		// The getName method is inherited from Bird, which inherits it
		// from Animal.
		// The getLegs method is inherited from Bird, which overrides
		// the abstract getLegs method inherited by Bird from Animal.
		// The getNumOfEggs method is inherited from Bird.
		// The canFly method is from Magpie, which overrides the abstract
		// canFly method inherited from Bird, which inherits it from Animal.
		System.out.println(m.getName() == "Maggie");
		System.out.println(m.getLegs() == 2);
		System.out.println(m.getNumOfEggs() == 6);
		System.out.println(m.canFly() == true);
	}
	
	
	
}