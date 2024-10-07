package Practice;

class Animal {
	Animal() {
		System.out.println("Animal Constructor");
	}
}

class Dog extends Animal {
	Dog() {
		super(); // Calls the parent class (Animal) constructor
		System.out.println("Dog Constructor");
	}
}

public class SuperMethod {
	public static void main(String[] args) {
		Dog d1 = new Dog(); // First calls the parent class constructor
	}
}
