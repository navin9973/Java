package Practice;

import java.util.Scanner;

public class Calculator {
	// print days and make a calculator
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1;

		do {
			System.out.println("Enter the Operation You Want to Perform:");
			System.out.println("Enter 1 For Addition");
			System.out.println("Enter 2 For Multiplication");
			System.out.println("Enter 3 For Division");
			System.out.println("Enter 0 To Exit...");
			num1 = sc.nextInt();

			switch (num1) {
			case 1: {
				System.out.println("Enter 2 Integers for Addition");
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println("Sum is " + (x + y));
				break;

			}
			case 2: {
				System.out.println("Enter 2 Integers for Multiplication");
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println("Mul is " + (x * y));
				break;

			}
			case 3: {
				System.out.println("Enter 2 Integers for Division");
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println("Result is " + (x / y));
				break;

			}
			case 0: {
				System.out.println("Thank-You");
				break;

			}
			default:
				System.out.println("Invalid Choice!!!");
			}
		}

		while (num1 != 0);

	}
}
