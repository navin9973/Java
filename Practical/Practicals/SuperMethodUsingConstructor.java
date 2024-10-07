package Practicals;

class Parents {
	
	Parents() {
//		super();
		System.out.println("Parent Constructor");

	}

	int a = 40;

	void display() {
		System.out.println("Parent Class");
	}

}

class Childs extends Parents {
	Childs() {
//		super();
		System.out.println("Child Constructor");

	}

	int a = 30;

	void display() {
		System.out.println("Child Class");
		System.out.println(a);
		System.out.println(super.a);
		super.display();
		
		
	}
}

public class SuperMethodUsingConstructor {
	public static void main(String args[]) {
		Childs obj = new Childs();
		obj.display();
		
	}

}
