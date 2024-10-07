package Practicals;

public class CommandLineArg {
	public static void main(String[] args) {
		// Check if any arguments were passed
		if (args.length > 0) {
			System.out.println("Command-line arguments:");
			// Loop through the arguments using a for loop
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("No command-line arguments were passed.");
		}
	}
}
