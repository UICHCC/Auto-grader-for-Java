public class RabbitStart {	

	public static void main(String[] args) {
		Rabbit r = new Rabbit("Bugs Bunny", 20.0);
		// getName is inherited from Mammal.
		System.out.println(r.getName() == "Bugs Bunny");
		System.out.println(r.getWeight() == 20.0);
		System.out.println(r.isCookable() == true);
	}

}
