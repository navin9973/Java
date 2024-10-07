package Practicals;
class AccessModifiersDemo {
    // Access Control
    public String publicField = "Public Field";       // Accessible everywhere
    protected String protectedField = "Protected Field"; // Accessible within the same package and subclasses
    String defaultField = "Default Field";            // Accessible within the same package
    private String privateField = "Private Field";    // Accessible only within the same class

    // Static Field
    static int staticCounter = 0;

    // Final Field (Constant)
    final int FINAL_VALUE = 100;

    // Constructor
    public AccessModifiersDemo() {
        staticCounter++; // Increment static counter for every object created
    }

    // Public Method
    public void displayFields() {
        System.out.println("Public Field: " + publicField);
        System.out.println("Protected Field: " + protectedField);
        System.out.println("Default Field: " + defaultField);
        System.out.println("Private Field: " + privateField);
    }

    // Static Method
    public static void showStaticCounter() {
        System.out.println("Static Counter: " + staticCounter);
    }

    // Final Method (Cannot be overridden)
    public final void showFinalValue() {
        System.out.println("Final Value: " + FINAL_VALUE);
    }

    // Protected finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called before garbage collection.");
    }
}

public class ModifierFinalize {
    public static void main(String[] args) {
        // Create objects of the AccessModifiersDemo class
        AccessModifiersDemo obj1 = new AccessModifiersDemo();
        AccessModifiersDemo obj2 = new AccessModifiersDemo();

        // Access and display fields and methods
        obj1.displayFields();
        obj1.showFinalValue();
        
        // Access static method
        AccessModifiersDemo.showStaticCounter();

        // Explicitly invoking garbage collection to demonstrate finalize() (not recommended in production code)
        obj1 = null;
        obj2 = null;
        System.gc();  // Suggesting JVM to run Garbage Collector

        // Wait for GC to complete (not guaranteed, but just for demo purposes)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



