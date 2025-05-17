package br.com.exemplos;

import java.util.Scanner;

public class WhileExercises3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Gas station algorithm
		// Reads the kind of fuel used by the consumer
		// they are organized like this -> 1 - Alcohol 2 - Gasoline 3 - Diesel 4 - end
		// whenever one of those numbers are typed, the program must repeat the loop
		// until 4 or any number above 4 is typed
		// when 4 or above 4 is typed, a message saying "Thank you!" must be written
		// and a list of how much of those fuels was bought

		int alcohol = 0;
		int gas = 0;
		int diesel = 0;

		int kind = sc.nextInt();

		while (kind != 4) {

			if (kind == 1) {
				
				alcohol = alcohol + 1;

			} else if (kind == 2) {

				gas = gas + 1;

			} else if (kind == 3) {

				diesel = diesel + 1;

			} else {
				
				System.out.print("\n invalid option");
				
			}

			kind = sc.nextInt();

		}

		System.out.println("\nThank you for using our services!");
		System.out.printf("\n Alcohol  -> %d", alcohol);
		System.out.printf("\n Gasoline -> %d", gas);
		System.out.printf("\n Diesel   -> %d", diesel);

		sc.close();

	}

}
