package Practice;
import java.util.*;



public class DivisibilityByTwo {
	//check whether the no. is divisible by 2 or not
	public static void main(String args[]) {
		System.out.println("Enter an Integer :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("Divisible by 2");
		}
		else {
			System.out.println("Not Divisible by 2");
		}
	}

}
