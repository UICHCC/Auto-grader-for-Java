public class HumanStart {	

	public static void main(String[] args) {
		Human h = new Human();
		// getName is inherited from Mammal.
		System.out.println(h.getName() == "Alice");
		System.out.println(h.isCookable() == false);  // No message printed.
	}

}
