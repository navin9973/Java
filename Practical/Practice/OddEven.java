package Practice;

import java.util.Scanner;

public class OddEven {
	//print odd if input value is odd otherwise print even
	public static void main(String args[]) {
		System.out.println("Enter an Integer :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}



