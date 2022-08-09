public class MammalStart {	
	public static void main(String[] args) {
		Mammal m = new Mammal("some name");
		System.out.println(m.getName() == "some name");
		System.out.println(m.isCookable() == false); // Message printed too.
	}
}
