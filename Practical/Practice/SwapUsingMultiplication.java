package Practice;

import java.util.Scanner;

public class SwapUsingMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.println("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using multiplication and division
        a = a * b;  // Step 1: a = a * b
        b = a / b;  // Step 2: b = a / b (now b = original a)
        a = a / b;  // Step 3: a = a / b (now a = original b)

        System.out.println("After swapping (using Multiplication and Division): a = " + a + ", b = " + b);
        sc.close();
    }
}

