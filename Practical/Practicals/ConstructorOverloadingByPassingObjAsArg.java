package Practicals;


	// Class representing a Box
	class Box {
	    double width, height, depth;

	    // Constructor 1: Initialize dimensions directly
	    Box(double width, double height, double depth) {
	        this.width = width;
	        this.height = height;
	        this.depth = depth;
	    }

	    // Constructor 2: Initialize using another Box object (Copy constructor)
	    Box(Box otherBox) {
	        this.width = otherBox.width;
	        this.height = otherBox.height;
	        this.depth = otherBox.depth;
	    }

	    // Method to calculate the volume of the box
	    double volume() {
	        return width * height * depth;
	    }
	}

	public class ConstructorOverloadingByPassingObjAsArg {
	    public static void main(String[] args) {
	        // Creating a Box object using the first constructor
	        Box box1 = new Box(10, 20, 15);
	        
	        // Creating another Box object using the copy constructor
	        Box box2 = new Box(box1);

	        // Display volumes
	        System.out.println("Volume of Box 1: " + box1.volume());
	        System.out.println("Volume of Box 2: " + box2.volume());
	    }
	}



