package Practicals;

//public class MethodOverloadingByPAssingObjAsArg {
	
	// Class representing a Rectangle
	class Rectangle {
	    int length;
	    int breadth;

	    Rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
	    
	    
	}

	// Class representing a Circle
	class Circle {
	    double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }
	    
	}
	
	

	// Main class with overloaded methods
	public class MethodOverloadingByPAssingObjAsArg {
		
		 // Method to calculate area of a rectangle
	    public double calculateArea(Rectangle rect) {
	        return rect.length * rect.breadth;
	    }
	    
	   

	    // Overloaded method to calculate area of a circle
	    public double calculateArea(Circle circle) {
	        return Math.PI * circle.radius * circle.radius;
	    }

	    public static void main(String[] args) {
	        // Create objects of Rectangle and Circle
	        Rectangle rectangle = new Rectangle(10, 20);
	        Circle circle = new Circle(7.5);

	        // Create an object of MethodOverloadingByPAssingObjAsArg
	        MethodOverloadingByPAssingObjAsArg demo = new MethodOverloadingByPAssingObjAsArg();

	        // Calculate and print areas
	        System.out.println("Area of Rectangle: " + demo.calculateArea(rectangle));
	        System.out.println("Area of Circle: " + demo.calculateArea(circle));
	    }
	}


