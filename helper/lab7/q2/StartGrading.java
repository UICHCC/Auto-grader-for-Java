class StartGrading {
	

	public static void main(String[] args) {
		testAnimal();
		testDog();
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
	
}