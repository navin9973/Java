package Practice;
class Parent3{
	
	
	void display() {
		System.out.println("Display method of parent class is called!");
	}
}
class Child3 extends Parent3{
	
	
	void display() {
		System.out.println("Display method of Child class is called!");
	}
}

public class DynamicMethodDispatch {
	public static void main(String args[]) {
		Parent3 Obj = new Child3();
		Obj.display();
	}
	

}
