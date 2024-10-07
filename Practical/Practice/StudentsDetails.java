package Practice;

class Student {
	// Instance variables
	String name;
	int age;
	String grade;

	// Parameterized constructor
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// Method to display student details
	public void displayDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade);
	}
}

public class StudentsDetails {
	public static void main(String[] args) {
		// Creating object using parameterized constructor
		Student student = new Student("Jay k", 18, "A");

		// Displaying student details
		student.displayDetails();
	}
}
