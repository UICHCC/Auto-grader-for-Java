class StartGrading {
	
	public static void testCar() {
		// Trying to create a car with the wrong number of doors:
		try {
			Car brokencar = new Car("Broken", 0);
		} catch(BadCarException ex) {
			// We can use the == operator here to compare strings because both strings
			// (the one stored inside the exception object, and the one used directly
			// in the test itself) are constant strings.  The string stored inside the
			// exception object and returned as result by the getMessage method is a
			// constant string because it is written directly in the code of the
			// Car constructor above.
			System.out.println(ex.getMessage() == "A car must have at least one door!");
		}
		// Create a good car.
		Car c = null;
		try {
			c = new Car("Biggy", 7);
		} catch(BadCarException ex) {
			System.out.println("BUG! This must never happen!");
		}
		// Prints 7 lines of output, each with the car's name and the fact
		// that the door is closed.
		// This method returns void and does not change the car object,
		// so there is no result or change that we can test directly, we
		// can only look at the printed output and make sure it is correct...
		c.listDoors();
		// When the car is created all the doors are closed (by default).
		System.out.println(c.countOpenDoors() == 0);
		// Change all the closed doors into open doors:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 7);
		// Prints 7 lines of output, each with the car's name and the fact
		// that the door is open.
		c.listDoors();
		// Change all the open doors into close doors:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 0);
		// Trying to open a nonexistent door:
		try {
			c.openOneDoor(0);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the openOneDoor method above.
			System.out.println(ex.getMessage().equals("Door 0 does not exist!"));
		}
		// Trying to open a nonexistent door again:
		try {
			c.openOneDoor(8);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the openOneDoor method above.
			System.out.println(ex.getMessage().equals("Door 8 does not exist!"));
		}
		// Opening door 3
		try {
			c.openOneDoor(3);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 1);
		// and 5:
		try {
			c.openOneDoor(5);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 2);
		// Change all the closed doors into open doors and vice versa:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 5);
		// Prints 7 lines of output, each with the car's name and the fact
		// that five doors are open and two are closed.
		c.listDoors();
		// Change all the closed doors into open doors and vice versa, again:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 2);
		// Prints 7 lines of output, each with the car's name and the fact
		// that two doors are open and five are closed.
		c.listDoors();
		// Trying to replace a nonexistent door:
		try {
			c.replaceDoor(0);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the replaceDoor method above.
			System.out.println(ex.getMessage().equals("Door 0 does not exist!"));
		}
		// Trying to replace a nonexistent door again:
		try {
			c.replaceDoor(8);
		} catch(BadDoorException ex) {
			// We must use the equals method to compare the strings, not the ==
			// operator, because the string stored inside the exception object
			// is constructed dynamically at runtime using the + operator in
			// the replaceDoor method above.
			System.out.println(ex.getMessage().equals("Door 8 does not exist!"));
		}
		// Replace door number 5 (which is currently open) with a
		// completely new door (which is closed by default when created).
		try {
			c.replaceDoor(5);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 1);
		// Prints 7 lines of output, each with the car's name and the fact
		// that 1 door is open and six are closed.
		c.listDoors();
		// Replace door number 3 (which is currently open) with a
		// completely new door (which is closed by default when created).
		try {
			c.replaceDoor(3);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 0);
		// Prints 7 lines of output, each with the car's name and the fact
		// that all doors are closed.
		c.listDoors();
		// Open all doors:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 7);
		// Prints 7 lines of output, each with the car's name and the fact
		// that all doors are open.
		c.listDoors();
		// Replace all doors (which are currently all open) with new doors
		// (which are closed by default when created):
		c.replaceAllDoors();
		System.out.println(c.countOpenDoors() == 0);
		// Prints 7 lines of output, each with the car's name and the fact
		// that all doors are closed.
		c.listDoors();
		// Open all doors again:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 7);
		// Prints 7 lines of output, each with the car's name and the fact
		// that all doors are open.
		c.listDoors();
		// Replace four doors (which are currently open) with new doors
		// (which are closed by default when created):
		c.replaceManyDoors(4);
		System.out.println(c.countOpenDoors() == 3);
		// Prints 7 lines of output, each with the car's name and the fact
		// that four doors are closed and three are open.
		c.listDoors();
		// Trying to replace more doors than the car has.  This will
		// replace all 7 existing car doors (with array indexes from 0 to 6)
		// with new doors, then raise an ArrayIndexOutOfBoundsException when
		// trying to replace the 8th door (at array index 7, which does not
		// exist).  We can catch this exception though, so that this test does
		// not kill the program...
		try {
			c.replaceManyDoors(20);
		} catch(ArrayIndexOutOfBoundsException ex) {
			// The message inside an ArrayIndexOutOfBoundsException simply indicates
			// the index which was outside the bounds of the array, in this case 7
			// (since our array has 7 doors, with array indexes from 0 to 6).
			// We must use the equals method because obviously the string which is
			// stored inside the exception object is only generated at runtime by
			// Java, since Java cannot know in advance that our program is going
			// to try to use an object which is past the end of the array).
			System.out.println(ex.getMessage().equals("Index 7 out of bounds for length 7"));
		}
		// There was an exception, but just before the exception happened
		// all the existing doors were actually replace with new doors (which
		// are closed by default), which we can check:
		System.out.println(c.countOpenDoors() == 0);
		// Prints 7 lines of output, each with the car's name and the fact
		// that all doors are closed.
		c.listDoors();
		// Add two new doors to the car:
		c.expandCar();
		// Since all existing 7 doors of the car were closed and since we
		// just added two new doors (which are closed by default) then the
		// car has now 9 closed doors.  We can then open them all and count
		// them:
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 9);
		// Prints 9 lines of output, each with the car's name and the fact
		// that all doors are open.
		c.listDoors();
	}
	
	public static void testDoor() {
		Door d = new Door();
		// Checking that the door is closed after it has been created:
		System.out.println(d.isOpen() == false);
		// Closing a closed door does nothing:
		d.close();
		System.out.println(d.isOpen() == false);
		// Opening a closed door opens the door:
		d.open();
		System.out.println(d.isOpen() == true);
		// Opening an open door does nothing:
		d.open();
		System.out.println(d.isOpen() == true);
		// Closing an open door closes the door:
		d.close();
		System.out.println(d.isOpen() == false);
	}
	
	public static void main(String[] args) {
		testDoor();
		testCar();
	}
}