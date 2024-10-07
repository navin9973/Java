package Practice;

class FinalExample {
	final int x = 10; // This variable cannot be modified

	final void display() {
		System.out.println("This is a final method.");
	}
}

public class FinalMethodExample {
	public static void main(String[] args) {
		FinalExample obj = new FinalExample();
		System.out.println("Value of x: " + obj.x); // x is final, so it cannot be changed
		obj.display();
	}
}
