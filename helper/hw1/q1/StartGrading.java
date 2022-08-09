
public class StartGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an object, "Charlie", of AutoRobot
		AutoRobot Charlie = new AutoRobot();
		System.out.println(Charlie.getName() == "xyz");
		// Test the initial currentSpeed
		System.out.println(Charlie.getCurrentSpeed() == 0.0);
		
		// Test setName
		Charlie.setName("Charlie"); // Set a new name for Charlie,
		System.out.println(Charlie.getName() == "Charlie");
		
		// Test accelerate()
		// If initial speed is 0, then it can be accelerated as 5.0
		Charlie.accelerate();
		System.out.println(Charlie.getCurrentSpeed() == 5.0);

		// If initial speed is 5.0, then it can be accelerated as 10.0
		Charlie.accelerate();
		System.out.println(Charlie.getCurrentSpeed() == 10.0);
		
		// If initial speed is 10.0, then it can be accelerated as 15.0
		Charlie.accelerate();
		System.out.println(Charlie.getCurrentSpeed() == 15.0);
		
		// If initial speed is 15.0, then it can be accelerated as 20.0
		Charlie.accelerate();
		System.out.println(Charlie.getCurrentSpeed() == 20.0);
		
		// If initial speed is 20.0, then it should remain unchanged
		Charlie.accelerate();
		if (Charlie.getCurrentSpeed() == 25.0) {
			System.out.println(Charlie.getCurrentSpeed() == 25.0);
			Charlie.accelerate();
			System.out.println(Charlie.getCurrentSpeed() == 25.0);
			
			// Test brake()
			// If initial speed is 25.0, it should be 20.0 after brake
			Charlie.brake();
		}
		
		System.out.println(Charlie.getCurrentSpeed() == 20.0);		
		
		// If initial speed is 20.0, it should be 15.0 after brake
		Charlie.brake();
		System.out.println(Charlie.getCurrentSpeed() == 15.0);

		// If initial speed is 15.0, it should be 10.0 after brake
		Charlie.brake();
		System.out.println(Charlie.getCurrentSpeed() == 10.0);

		// If initial speed is 10.0, it should be 5.0 after brake
		Charlie.brake();
		System.out.println(Charlie.getCurrentSpeed() == 5.0);
				
		// If initial speed is 5.0, it should be 0 after brake
		Charlie.brake();
		System.out.println(Charlie.getCurrentSpeed() == 0.0);

		// If initial speed is already 0, it should be remain unchanged
		Charlie.brake();
		System.out.println(Charlie.getCurrentSpeed() == 0.0);
		
		// Run ShowStatus()
		Charlie.showStatus();
		
	}

}
