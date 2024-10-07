package Practicals;

//Superclass
class Person {
 public String name;
 protected int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void showPersonDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Subclass
class Employee extends Person {
 protected double salary;

 public Employee(String name, int age, double salary) {
     super(name, age);
     this.salary = salary;
 }

 public void showEmployeeDetails() {
     showPersonDetails(); // Access public method from superclass
     System.out.println("Salary: " + salary);
 }
}

//Subclass of Employee (Multilevel Inheritance)
class Manager extends Employee {
 private String department;

 public Manager(String name, int age, double salary, String department) {
     super(name, age, salary);
     this.department = department;
 }

 public void showManagerDetails() {
     showEmployeeDetails(); // Access method from Employee class
     System.out.println("Department: " + department);
 }
}

public class MultilevelInheritanceTest {
 public static void main(String[] args) {
     Manager manager = new Manager("Rohan", 40, 75000, "HR");
     manager.showManagerDetails();
 }
}
