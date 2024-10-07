package Practice;

import java.util.Scanner;

class Count {
	static int count = 0;

	public static void increment(int input) {

		while (input % 10 != 0) {
			count++;
			input++;
		}
		System.out.println("Count :" + count);

	}

	public static void CountFactor(int num) {
		int facCount = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				facCount++;
			}

		}
		System.out.println("No. of Factor Of " + num + " is :" + facCount);

	}

}

public class ManuDriven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num != 3) {
			System.out.println("\nChoose the Result You Want!!");
			System.out.println("1. Count(Gives the Value of Count until count is dividible by 10)");
			System.out.println("2. Factor of A Number");
			System.out.println("3. Exit");
			num = sc.nextInt();

			switch (num) {
			case 1: {
				System.out.println("Enter Any Integer you Want");
//				Scanner s = new Scanner(System.in);
				int i = sc.nextInt();
				Count.increment(i);
				break;
			}
			case 2: {
				System.out.println("Enter an Integer ");
//				Scanner s1 = new Scanner(System.in);
				int i = sc.nextInt();
				Count.CountFactor(i);
				break;
			}
			case 3: {
				System.out.println("Thank-You");
				break;

			}

			default:
				System.out.println("Invalid Input");

			}
		}

		sc.close();
	}

}
