public class FrankTheRabbitStart {	

	public static void main(String[] args) {
		FrankTheRabbit ftr = new FrankTheRabbit();
		// getName is inherited from Mammal.
		System.out.println(ftr.getName() == "Frank");
		// getWeight is inherited from Rabbit.
		System.out.println(ftr.getWeight() == 100.0);
		// isCookable is from FrankTheRabbit itself.
		System.out.println(ftr.isCookable() == false);
	}

}
