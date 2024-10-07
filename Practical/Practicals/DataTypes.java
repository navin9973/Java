package Practicals;

public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte b = 10;
        short s = 200;
        int i = 1000;
        long l = 100000L;

        // Floating point types
        float f = 10.5f;
        double d = 100.5;

        // Character type
        char c = 'A';

        // Boolean type
        boolean bool = true;

        // Print values and sizes
        System.out.println("Byte value: " + b + " | Size: " + Byte.BYTES + " bytes");
        System.out.println("Short value: " + s + " | Size: " + Short.BYTES + " bytes");
        System.out.println("Integer value: " + i + " | Size: " + Integer.BYTES + " bytes");
        System.out.println("Long value: " + l + " | Size: " + Long.BYTES + " bytes");
        System.out.println("Float value: " + f + " | Size: " + Float.BYTES + " bytes");
        System.out.println("Double value: " + d + " | Size: " + Double.BYTES + " bytes");
        System.out.println("Char value: " + c + " | Size: " + Character.BYTES + " bytes");
        System.out.println("Boolean value: " + bool + " | Size: 1 bit (JVM dependent)");
    }
}
