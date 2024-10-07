package Practice;

class Student1 {
	String name;
	int age;

	// Constructor 1
	Student1(String name) {
		this(name, 18); // Calls Constructor 2
	}

	// Constructor 2
	Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class ThisMethod {
	public static void main(String[] args) {
		Student1 s1 = new Student1("John"); // Calls the first constructor
		s1.display();
	}
}
