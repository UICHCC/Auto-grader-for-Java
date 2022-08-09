class StartGrading {
	
	public static void testShape() {
	}
	
	public static void testCircle() {
		// Create a circle with a positive radius.
		// No exception is thrown until we resize with a
		// negative radius.
		try {
			Circle c = new Circle(1.2, 3.4, 4.0);
			// getX, getY, and move are inherited from Shape.
			// area and resize come from Circle itself.
			System.out.println(c.getX() == 1.2);
			System.out.println(c.getY() == 3.4);
			System.out.println(c.area() == Math.PI * 16.0);
			// Move the circle.  The area does not change.
			c.move(7.8, 9.0);
			System.out.println(c.getX() == 9.0);
			System.out.println(c.getY() == 12.4);
			System.out.println(c.area() == Math.PI * 16.0);
			// Resize the circle.  The area changes but not the position.
			c.resize(8.0);
			System.out.println(c.getX() == 9.0);
			System.out.println(c.getY() == 12.4);
			System.out.println(c.area() == Math.PI * 64.0);
			// Resize the circle with a negative radius.
			// An exception is thrown, caught, and tested.
			c.resize(-12.3);
			System.out.println(c.getX() == 9.0); // Unreachable.
			System.out.println(c.getY() == 12.4);
			System.out.println(c.area() == Math.PI * 64.0);
		} catch(BadRadiusException ex) {
			System.out.println(ex.getMessage() == "Radius must be positive!");
		}
		// Create a circle with a positive radius.
		// Resize the circle with a zero radius.
		// No exception is thrown.
		try {
			Circle c = new Circle(1.2, 3.4, 4.0);
			c.resize(0.0);
			// The area is now zero, the position does not change.
			System.out.println(c.getX() == 1.2);
			System.out.println(c.getY() == 3.4);
			System.out.println(c.area() == 0.0);
		} catch(BadRadiusException ex) {
			System.out.println("BUG! This must never happen!");
		}
		// Try to create a circle with a negative radius.
		// An exception is thrown, caught, and tested.
		try {
			Circle c2 = new Circle(1.2, 3.4, -5.6);
		} catch(BadRadiusException ex) {
			System.out.println(ex.getMessage() == "Radius must be positive!");
		}
		// Create a circle with a zero radius.
		// No exception is thrown.
		try {
			Circle c3 = new Circle(1.2, 3.4, 0.0);
			System.out.println(c3.getX() == 1.2);
			System.out.println(c3.getY() == 3.4);
			System.out.println(c3.area() == 0.0);
		} catch(BadRadiusException ex) {
			System.out.println("BUG! This must never happen!");
		}
	}

	public static void testDot() {
		Dot d = new Dot(1.2, 3.4);
		// getX, getY, and move are inherited from Shape.
		// area and resize come from Dot itself.
		System.out.println(d.getX() == 1.2);
		System.out.println(d.getY() == 3.4);
		System.out.println(d.area() == 0.0);
		// Move the dot.  The area does not change.
		d.move(7.8, 9.0);
		System.out.println(d.getX() == 9.0);
		System.out.println(d.getY() == 12.4);
		System.out.println(d.area() == 0.0);
		// Resize the dot.  An exception is thrown, caught, and tested.
		try {
			d.resize(12.3);
		} catch(Exception ex) {
			System.out.println(ex.getMessage() == "Cannot resize a dot!");
		}
		// The area and position do not change.
		System.out.println(d.getX() == 9.0);
		System.out.println(d.getY() == 12.4);
		System.out.println(d.area() == 0.0);
	}
	
	public static void testSquare() {
		Square s = new Square(1.2, 3.4, 5.0);
		// getX, getY, and move are inherited from Shape.
		// area and resize are inherited from Rectangle.
		System.out.println(s.getX() == 1.2);
		System.out.println(s.getY() == 3.4);
		System.out.println(s.area() == 25.0);
		// Move the square.  The area does not change.
		s.move(7.8, 9.0);
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 25.0);
		// Resize the square.  The area changes but not the position.
		s.resize(12.0);
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 144.0);
		// Resize the square again with different width and length!
		// An exception is thrown, caught, and tested.
		try {
			s.resize(10.0, 15.0);
			System.out.println("Unreachable");
//			System.out.println(s.getX() == 9.0); // Unreachable.
//			System.out.println(s.getY() == 12.4);
//			System.out.println(s.area() == 150.0);
		} catch(CannotResizeException ex) {
			System.out.println(ex.getMessage() == "Cannot resize a square into a rectangle!");
		}
		// The area and position do not change.
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 144.0);
		// Resize the square again with equal width and length.
		// The area changes but not the position.
		try {
			s.resize(10.0, 10.0);
		} catch(CannotResizeException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 100.0);
	}
	
	public static void testRectangle() {
		Rectangle r = new Rectangle(1.2, 3.4, 4.0, 5.0);
		// getX, getY, and move are inherited from Shape.
		// area and resize come from Rectangle itself.
		System.out.println(r.getX() == 1.2);
		System.out.println(r.getY() == 3.4);
		System.out.println(r.area() == 20.0);
		// Move the rectangle.  The area does not change.
		r.move(7.8, 9.0);
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 20.0);
		// Resize the rectangle.  The area changes but not the position.
		r.resize(12.0);
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 144.0);
		// Resize the rectangle again with different width and length.
		// The area changes but not the position.
		try {
			r.resize(10.0, 15.0);
		} catch(CannotResizeException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 150.0);
	}
	
	public static void main(String[] args) {
		testShape();
		testCircle();
		testDot();
		testSquare();
		testRectangle();
	}
}