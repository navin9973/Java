package Practicals;

class P {
	int a = 20;

	void display() {
		System.out.println("Parent Method");
	}
}
class C extends P{
	int a = 40;
	void display() {
		System.out.println("Child Method");
		System.out.println(a);
		System.out.println(super.a);
		super.display();
		
	}
}

public class SuperKeywordVariableAndMethod {
	public static void main(String args[])
	{
		C obj = new C();
		obj.display();

	}
}
