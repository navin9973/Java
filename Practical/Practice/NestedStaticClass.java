package Practice;
class Outer1{
	private int x = 8;
	protected int z = 5;
	int  d = 8;
	static int s = 22;
	
	void fun() {
		Inner1 obj = new Inner1();
			obj.innerMethod();
		}
	
	private void fun1() {
		System.out.println("private int x = " + d + " using Private method and private variable");
	}
	public void fun2() {
		System.out.println("private int x = " + x + " using public method and private variable");
	}
	
	protected void fun3() {
		System.out.println("private int x = " + x + " using protected method and private variable");
	}
	void fun4() {
		System.out.println("private int x = " + z + " using Default method and protected variable");
	}
	static void fun5() {
		System.out.println("private int x = " + s + " using static method and static variable");
	}
	
	static class Inner1{
		
		void innerMethod() {
				
				Outer1 obj1  = new Outer1();
			
				System.out.println("Accessing from Inner Class");
				obj1.fun1();
				obj1.fun2();
				obj1.fun3();
				obj1.fun4();
				fun5();

		}
		
	}
	
	
}

public class NestedStaticClass {
	public static void main(String args[]) {
		Outer1 obj2 = new Outer1();
		obj2.fun();
	}

}
