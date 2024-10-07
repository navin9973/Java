package Practice;

class Parentt {
	int x = 4;

	// Initializer block
	{
		System.out.println("Inside Initializer Block in parent class");
	}

	static {
		System.out.println("Static inside Parent class");
	}

	// Constructor
	Parentt() {
		System.out.println("Inside Constructor");
	}
}

public class StaticvsConstructorvsInitializer {
//	Static Block
	static {
		System.out.println("Static inside DynamicDispatch class but outside main method");
	}

	public static void main(String[] args) {
		Parentt parent = new Parentt(); // This will trigger the initializer block and constructor

		// Initializer block in main method
		{
			System.out.println("Inside Initializer Block");
		}

		// Initializer block in main method
//		static{
//			System.out.println("shows error but why?");
//		}
	}
}
