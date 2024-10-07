package Practice;

import java.util.Scanner;

public class GreatestAmongThreeNum {
	//give 3 inputs and find the greatest no. among them.
	public static void main(String args[]) {
		System.out.println("Enter 3 Integers :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 +" is Greatest Integer ");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2 +" is Greatest Integer ");
			
		}
		else {
			System.out.println(num3 +" is Greatest Integer ");
		}
		
}
}
