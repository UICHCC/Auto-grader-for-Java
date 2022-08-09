class StartGrading {	

	public static void main(String[] args) {
		testAnimal();
		testDog();
		testBird();
		testMagpie();
		testOstrich();
		testPegasus();
		
		Flyer m = new Magpie("Maggie");
		System.out.println(m.getName() == "Maggie");
		System.out.println(m.canFly() == true);

		Flyer o = new Ostrich("Ossie");
		System.out.println(o.getName() == "Ossie");
		System.out.println(o.canFly() == false);

		Flyer p = new Pegasus("Peggie");
		System.out.println(p.getName() == "Peggie");
		System.out.println(p.canFly() == true);
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
	
	// Since the Ostrich class is not abstract, we can create objects from
	// the Ostrich class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class and the getLegs and getNumOfEggs methods which are
	// inherited from the Bird class).
	public static void testOstrich() {
		Ostrich o = new Ostrich("Ossie");
		// The getName method is inherited from Bird, which inherits it
		// from Animal.
		// The getLegs method is inherited from Bird, which overrides
		// the abstract getLegs method inherited by Bird from Animal.
		// The getNumOfEggs method is inherited from Bird.
		// The canFly method is from Ostrich, which overrides the abstract
		// canFly method inherited from Bird, which inherits it from Animal.
		System.out.println(o.getName() == "Ossie");
		System.out.println(o.getLegs() == 2);
		System.out.println(o.getNumOfEggs() == 10);
		System.out.println(o.canFly() == false);
	}
	
	
	// Since the Pegasus class is not abstract, we can create objects from
	// the Pegasus class, and therefore we can test all the methods in the
	// class (including the getName method which is inherited from the
	// Animal class and the getLegs and getNumOfEggs methods which are
	// inherited from the Bird class).
	public static void testPegasus() {
		Pegasus p = new Pegasus("Peggie");
		// The getName method is inherited from Bird, which inherits it
		// from Animal.
		// The getLegs method is from Pegasus, which overrides the getLegs
		// method inherited from Bird, which overrides the abstract
		// getLegs method inherited by Bird from Animal.
		// The getNumOfEggs method is from Pegasus, which overrides the
		// getNumOfEggs method inherited from Bird.
		// The canFly method is from Pegasus, which overrides the abstract
		// canFly method inherited from Bird, which inherits it from Animal.
		System.out.println(p.getName() == "Peggie");
		System.out.println(p.getLegs() == 4);
		System.out.println(p.getNumOfEggs() == 0); // Message printed here.
		System.out.println(p.canFly() == true);
	}

	

}