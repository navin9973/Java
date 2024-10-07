package Practice;

class Outer{
	void test() {
		Inner obj = new Inner();
		obj.show();
	}
	
	void message() {
		System.out.println("Hello Outer Method");
	}
	
	class Inner{
		void show() {
			System.out.println("Show method from Inner Class");
			message();
		}
	}
}

public class NestedClass {
	public static void main(String args[]) {
		Outer  obj1 = new  Outer();
		obj1.test();
		
	}

}
