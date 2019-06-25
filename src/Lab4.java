import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userInput;

		System.out.println("Learn your squares and cubes!\n");

		do {
			System.out.print("Please enter an integer: \n");
			int numInput = scnr.nextInt();

			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("______     _______    _____\n");
			System.out.printf("------     -------    -----\n");
			
			int i = 1;
			while (i <= numInput) {
				int numSquared = i * i;
				int numCubed = numSquared * i;
				System.out.printf("%-10s %-10s %-10s\n", i, numSquared, numCubed);
				i++;
			}

			System.out.println("");
			System.out.printf("%-10s", "Multiplication Table\n");
			System.out.printf("____________________\n");
			System.out.printf("--------------------\n");

			int j = 1;
			while (j <= numInput) {
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
						j, j * 2, j * 3, j * 4, j * 5, j * 6, j * 7, j * 8, j * 9);
				j++;
			}

			System.out.println("Continue? (y/n): ");
			userInput = scnr.next();

		} while (userInput.equals("y"));

		System.out.println("Goodbye!");
		scnr.close();
	}


	public boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10 || (Math.abs(n - 200) <= 10)) {
			return true;
		} else {
			return false;
		}
	}
}