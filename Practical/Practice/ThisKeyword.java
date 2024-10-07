package Practice;

//class A {
//	int a = 10;
//
//	void display() {
//		System.out.println(a); // this.a (explicitily we do not write it)
//
//	}
//
//}
//
//public class ThisKeyword {
//
//	public static void main(String args[]) {
//		A obj = new A();
//		obj.display();
//
//	}
//}
class A {
	int a = 10;

	void display() {
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);

	}

}

public class ThisKeyword {

	public static void main(String args[]) {
		A obj = new A();
		obj.display();

	}
}
