package Practicals;
	// Superclass
	class Animal {
	    public String name;          
	    private int age;            
	    protected String species;    

	    // Constructor
	    public Animal(String name, int age, String species) {
	        this.name = name;
	        this.age = age;
	        this.species = species;
	    }

	    // Public method: Can be accessed by subclass and outside class
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Species: " + species);
	    }

	    // Private method: Only accessible within this class
	    private void displayAge() {
	        System.out.println("Age: " + age);
	    }

	    // Protected method: Accessible within the same package and subclass
	    protected void showSpecies() {
	        System.out.println("Species: " + species);
	    }
	}

	// Subclass - Single Inheritance
	class Dog extends Animal {
	    private String breed;

	    public Dog(String name, int age, String species, String breed) {
	        super(name, age, species);
	        this.breed = breed;
	    }

	    public void displayDogInfo() {
	        displayInfo(); // Accessing public method of superclass
	        showSpecies(); // Accessing protected method of superclass
	        System.out.println("Breed: " + breed);
	    }
	}

	public class SingleInheritance {
	    public static void main(String[] args) {
	        Dog dog = new Dog("Max", 5, "Canine", "Golden Retriever");
	        dog.displayDogInfo();
	    }
	}



