
public class StartGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCat();
		testDog();
		testStudent();
		
		// System tests, to test both classes together.
		Cat c = new Cat("Meow", 2.0);
		Student s = new Student("Philippe", c);

		System.out.println(s.getPet().getName() == "Meow");
		System.out.println(s.getPet().getWeight() == 2.0);
		// Feeding the student's pet cat:
		s.getPet().feed();
		System.out.println(s.getPet().getName() == "Meow");
		System.out.println(s.getPet().getWeight() == 3.0);
	}

	public static void testCat() {
		Cat c = new Cat("Meow", 2.0);
		System.out.println(c.getName() == "Meow"); System.out.println(c.getWeight() == 2.0);
		c.feed();
		// The name is still the same but the weight increased by 1.0: 
		System.out.println(c.getName() == "Meow"); 
		System.out.println(c.getWeight() == 3.0);
	}
	public static void testDog() {
		
		Dog d = new Dog("Woof", 2.0);
		
		System.out.println(d.getName() == "Woof"); 
		System.out.println(d.getWeight() == 2.0); 
		d.feed(); 
		// The name is still the same but the weight increased by 2.0: 
		System.out.println(d.getName() == "Woof"); 
		System.out.println(d.getWeight() == 4.0);
		
	}
	public static void testStudent() {
		Cat c = new Cat("Meow", 2.0);
		Student s = new Student("Philippe", c);

		System.out.println(s.getName() == "Philippe");
		System.out.println(s.getPet() == c);		
	}
}
