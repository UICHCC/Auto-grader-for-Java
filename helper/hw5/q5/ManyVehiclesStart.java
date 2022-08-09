//Q5
public class ManyVehiclesStart {
	public static void TestManyVehicles() {
		ManyVehicles mv = new ManyVehicles();
// Add any kind of vehicles to the arraylist.
		try {
			Train t = new Train(350, 300);
			mv.addVehicle(t);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			Car c = new Car(100, 80);
			mv.addVehicle(c);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			Aircraft a = new Aircraft(700, 200, 100);
			mv.addVehicle(a);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (BadAltitudeSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		System.out.println(mv.calcAvgSpeed() == 193);
	}
	public static void main(String[] args)  
	{ 
		TestManyVehicles(); 
	} 
}
