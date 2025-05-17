package br.com.exemplos;

import java.util.Scanner;

public class WhileExemple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// While number is different from 0
		// reads n numbers

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {

			soma += x;
			x = sc.nextInt();
			System.out.println("typed number = " + x);

			if (x == 0) {

				System.out.println("You typed the right number = " + x);
				System.out.printf("And the sum of all the typed numbers is = %d", soma);
			}

		}

		sc.close();
	}

}