package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads if someone are eligible for work
		// If he is a criminal, he is not eligible
		// else, he is eligible

		String isCriminal;

		//
		System.out.print("\nIs the individual a wanted criminal? ");
		isCriminal = sc.next().trim();

		if (!isCriminal.equalsIgnoreCase("no")) {
			System.out.print("\n\nThis individual is not eligible to work here!");
		} else {
			System.out.print("\n\nThis individual is eligible to work here!");
		}

		sc.close();
	}

}