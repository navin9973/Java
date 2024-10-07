package Practice;

import java.util.Scanner;

public class DivisionOfPeopleIntoThreeAgeGroup {
//	//write a program to divide the people into 3 age group depending on their age
	public static void main(String args[]) {
		System.out.println("Enter an Integer :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>60) {
			System.out.println("You are Above 60");
		}
		else if(num>18 && num<60) {
			System.out.println("You are Adult");
		}
		else {
			System.out.println("You are Not Adult");
		}

}
}
