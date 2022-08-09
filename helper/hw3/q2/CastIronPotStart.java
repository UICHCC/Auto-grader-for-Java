public class CastIronPotStart {	
	public static void testCastIronPot() {
		// In the testCastIronPot method, create a lapin saute chasseur called lsc1...
		LapinSauteChasseur lsc1 = new LapinSauteChasseur();
		// then create a cast iron pot with this lapin saute chasseur in it.
		CastIronPot cip = new CastIronPot(lsc1); // Implicit upcast from LapinSauteChasseur to Rabbit.
		// Then get the lapin saute chasseur from the cast iron pot...
		Rabbit r = cip.getRabbit();
		// and store it into a local variable called lsc2 of type LapinSauteChasseur.
		LapinSauteChasseur lsc2 = (LapinSauteChasseur)r; // Downcast mandatory!
		// Use the == operator to check that lsc1 and lsc2 are the same lapin Saute Chasseur.
		System.out.println(lsc1 == lsc2);
	}


	public static void main(String[] args) {
		testCastIronPot();
	}


}
