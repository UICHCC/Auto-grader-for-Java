//Q5
public class CarStart {
	public static void TestCar(){
		// test case for constructors
		try {
			// exception
			Car c1 = new Car(70, 80);
		} catch (BadSpeedSetting e) {
			System.out.println(e.getMessage().equals("Speed cannot be greater than speed limit!"));
		}
		try {
			// exception
			Car c2 = new Car(70, -10);
		} catch (BadSpeedSetting e) {
			System.out.println(e.getMessage().equals("Speed cannot be negative!"));
		}
		// test case for accelerate, canFly and getSpeed methods
		try {
			Car c3 = new Car(100, 80);
			// test the canFly method
			System.out.println(c3.canFly() == false);
			c3.accelerate(10);
			System.out.println(c3.getSpeed() == 90);
			// test the accelerate with positive amount
			c3.accelerate(-20);
			System.out.println(c3.getSpeed() == 70);
			// test the accelerate with negative amount
			c3.accelerate(35); // exception
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (ExceedSpeedLimit e) {
			System.out
					.println(e.getMessage().equals("Current speed is 70. Accelerate 35 will exceed the speed limit!"));
		} catch (NotEnoughSpeed e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (TrainSpeedChange e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			Car c4 = new Car(100, 80);
			// exception
			c4.accelerate(-90);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (ExceedSpeedLimit e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (NotEnoughSpeed e) {
			System.out.println(e.getMessage().equals("Current speed is " + 80 + ", not enough speed to decelerate!"));
		} catch (TrainSpeedChange e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
	}
	public static void main(String[] args)  
	{ 
		TestCar(); 
	} 
}
