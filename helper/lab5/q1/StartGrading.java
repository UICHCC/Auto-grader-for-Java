
public class StartGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCat();

	}

	public static void testCat() {
		Cat c = new Cat("Meow", 2.0);
		System.out.println(c.getName() == "Meow"); 
		System.out.println(c.getWeight() == 2.0);
		c.feed();
		// The name is still the same but the weight increased by 1.0: 
		System.out.println(c.getName() == "Meow"); 
		System.out.println(c.getWeight() == 3.0);
	}
}
