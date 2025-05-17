package br.com.exemplos;

import java.util.Scanner;

public class WhileExercises1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// repeats the reading of a password until its valid
		// for every wrong password, writes the message "Wrong password!"
		// when the correct password is informed writes "Correct password"
		// finishes the program
		// correct password -> 2002

		System.out.print("Password: ");
		int password = sc.nextInt();

		while (password != 2002) {

			System.out.print("\nWrong password!\n");
			System.out.print("\nPassword: ");
			password = sc.nextInt();

		}
		System.out.printf("\n\nCorrect password!");
		sc.close();

	}

}
