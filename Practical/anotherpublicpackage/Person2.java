package anotherpublicpackage;

import publicpackage.Person;

public class Person2 {
	public static void main(String[] args) {

		Person person = new Person("jay kumar");

		System.out.println("Accessing public field: " + person.name);
		System.out.println("From another class and package");
		person.displayInfo();
	}
}
