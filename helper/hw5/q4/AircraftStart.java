//Q4
public class AircraftStart {
	public static void TestAircraft() {
		// test case for constructors
		try {
			// Exception
			Aircraft a1 = new Aircraft(70, 80, 1000);
		} catch (BadSpeedSetting e) {
			System.out.println(e.getMessage().equals("Speed cannot be greater than speed limit!"));
		} catch (BadAltitudeSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			// exception
			Aircraft a2 = new Aircraft(70, -10, 1000);
		} catch (BadSpeedSetting e) {
			System.out.println(e.getMessage().equals("Speed cannot be negative!"));
		} catch (BadAltitudeSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			// exception
			Aircraft a3 = new Aircraft(700, 200, -10);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (BadAltitudeSetting e) {
			System.out.println(e.getMessage().equals("Altitude cannot be negative!"));
		}
		// Test case for accelerate, canFly, getSpeed and getAltitude methods
		try {
			Aircraft a4 = new Aircraft(700, 200, 100);
			// test the getAltitude method
			System.out.println(a4.getAltitude() == 100);
			// test the canFly method
			System.out.println(a4.canFly() == true);
			a4.accelerate(100);
			System.out.println(a4.getSpeed() == 300);
			// test the accelerate with positive amount
			a4.accelerate(-200);
			System.out.println(a4.getSpeed() == 100);
			// test the accelerate with negative amount
			// exception
			a4.accelerate(650);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (BadAltitudeSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (ExceedSpeedLimit e) {
			System.out.println(
					e.getMessage().equals("Current speed is 100. Accelerate 650 will exceed the speed limit!"));
		} catch (NotEnoughSpeed e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (TrainSpeedChange e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			Aircraft a5 = new Aircraft(700, 200, 100);
			// exception
			a5.accelerate(-300);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (BadAltitudeSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (ExceedSpeedLimit e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (NotEnoughSpeed e) {
			System.out.println(e.getMessage().equals("Current speed is " + 200 + ", not enough speed to decelerate!"));
		} catch (TrainSpeedChange e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
	}
	
	public static void main(String[] args)  
	{ 
		TestAircraft(); 
	} 
}
