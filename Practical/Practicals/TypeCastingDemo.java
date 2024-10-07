package Practicals;

public class TypeCastingDemo {
	public static void main(String[] args) {
        // Implicit Casting (Widening Conversion)
        int intValue = 50;
        double doubleValue = intValue; // int to double

        System.out.println("Implicit Casting:");
        System.out.println("Int value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // Explicit Casting (Narrowing Conversion)
        double anotherDoubleValue = 42.99;
        int anotherIntValue = (int) anotherDoubleValue; // double to int

        System.out.println("\nExplicit Casting:");
        System.out.println("Double value: " + anotherDoubleValue);
        System.out.println("Int value after casting: " + anotherIntValue);
    }

}
