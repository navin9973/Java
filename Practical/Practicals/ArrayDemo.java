package Practicals;

public class ArrayDemo {
	public static void main(String[] args) {
        // 1D Array
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop through the 1D array and print each element
        System.out.println("1D Array Elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through the 2D array and print each element
        System.out.println("2D Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}

//check whether the no. is divisible by 2 or not
//write a program to divide the people into 3 age group depending on their age
//print odd if input value is odd otherwise print even
//give 3 inputs and find the greatest no. among them.
// print days and make a calculator

