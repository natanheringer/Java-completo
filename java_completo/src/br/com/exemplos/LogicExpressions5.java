package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads two integer numbers
		// Tells if the numbers are multiples of each other

		int A, B;

		System.out.print("\n\nDescubra se dois numeros sao multiplos entre si!\n\n");

		System.out.print("Digite o primeiro numero: ");
		A = sc.nextInt();

		System.out.print("\nDigite o segundo numero: ");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.print("\nSAO MULTIPLOS!");
		} else {
			System.out.print("\nNAO SAO MULTIPLOS!");
		}

		sc.close();

	}

}