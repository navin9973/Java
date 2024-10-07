package Practice;

import java.util.Scanner;

public class SwitchCase 
{
	// print days 
	public static void main(String args[]) 
	{
		System.out.println("Enter Day no from (1 to 7) :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		switch(num1) 
		{
		case 1: {
			System.out.println("Sunday");
			break;
			}
		case 2: {
			System.out.println("Monday");
			break;
			}
		case 3: {
			System.out.println("Tuesday");
			break;
			}
		case 4: {
			System.out.println("Wednesday");
			break;
			}
		case 5: {
			System.out.println("Thursday");
			break;
			}
		case 6: {
			System.out.println("Friday");
			break;
			}
		case 7: {
			System.out.println("Saturday");
			break;
			}
		default:
		{
			System.out.println("Invalid Day No...");
		}

		}
	}
}