package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExercise4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// reads four integer values A, B, C and D.
		// Calculates and show the difference between the product
		// of A and B for the product of C and D
		// Using the following formula (A * B - C * D)

		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		System.out.print("Selecione o valor de A:");
		A = sc.nextInt();
		System.out.print("Selecione o valor de B:");
		B = sc.nextInt();
		System.out.print("Selecione o valor de C:");
		C = sc.nextInt();
		System.out.print("Selecione o valor de D:");
		D = sc.nextInt();

		int difference = A * B - C * D;

		System.out.printf("Diferença de (" + A + "x" + B + " - " 
				+ C + "x" + D + ") = " + difference);

		sc.close();
	}

}