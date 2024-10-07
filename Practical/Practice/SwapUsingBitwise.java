package Practice;

import java.util.Scanner;

public class SwapUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.println("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using XOR
        a = a ^ b;  // Step 1: a = a ^ b
        b = a ^ b;  // Step 2: b = a ^ b
        a = a ^ b;  // Step 3: a = a ^ b

        System.out.println("After swapping (using XOR): a = " + a + ", b = " + b);
        sc.close();
    }
}

