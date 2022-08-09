class StartGrading {
	
	public static void testShape() {
	}
	
	public static void testCircle() {
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
	}
	
	public static void main(String[] args) {
		testShape();
		testCircle();
		testDot();
		testSquare();
		testRectangle();
	}
}