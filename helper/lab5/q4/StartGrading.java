
public class StartGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCat();
		testDog();
		testStudent();
		testAnimal();
		
		// System tests, to test both classes together.
		Cat c = new Cat("Meow", 2.0);
		Student s0 = new Student("Philippe", c);
		System.out.println(s0.getPet().getName() == "Meow");
		System.out.println(s0.getPet().getWeight() == 2.0);
		s0.getPet().setWeight(3.0);
		System.out.println(s0.getPet().getName() == "Meow");
		System.out.println(s0.getPet().getWeight() == 3.0);

		// Creating a new student with a dog as pet:
		Dog d = new Dog("Woof", 2.0);
		Student s1 = new Student("Mr. Li", d);
		System.out.println(s1.getPet().getName() == "Woof");
		System.out.println(s1.getPet().getWeight() == 2.0);
		s1.getPet().setWeight(3.0);
		System.out.println(s1.getPet().getName() == "Woof");
		System.out.println(s1.getPet().getWeight() == 3.0);

		// We can now also use an Animal object as a pet:
		Animal a = new Animal("Blob", 5.0);
		Student s2 = new Student("Ms. Chen", a);
		System.out.println(s2.getPet().getName() == "Blob");
		System.out.println(s2.getPet().getWeight() == 5.0);
		s2.getPet().setWeight(3.0);
		System.out.println(s2.getPet().getName() == "Blob");
		System.out.println(s2.getPet().getWeight() == 3.0);
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
	
	public static void testAnimal() {
		Animal a = new Animal("Blob", 2.0);
	
		System.out.println(a.getName() == "Blob");
		System.out.println(a.getWeight() == 2.0);
		a.setWeight(3.0);
		System.out.println(a.getName() == "Blob");
		System.out.println(a.getWeight() == 3.0);
	}
}
