package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExercise6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// reads piece 1 - code, amount, value
		// reads piece 2 - code, amount, value
		// calculate the sum between the two pieces

		int code1, code2, amount1, amount2;
		double price1, price2;

		// Entry of the first piece
		System.out.print("Selecione o codigo da primeira peca:");
		code1 = sc.nextInt();
		System.out.print("Selecione a quantidade da primeira peca:");
		amount1 = sc.nextInt();
		System.out.print("Valor da primeira peca: ");
		price1 = sc.nextDouble();

		// Entry of the second piece
		System.out.print("Selecione o codigo da segunda peca:");
		code2 = sc.nextInt();
		System.out.print("Selecione a quantidade da segunda peca:");
		amount2 = sc.nextInt();
		System.out.print("Valor da segunda peca: ");
		price2 = sc.nextDouble();

		double total = amount1 * price1 + amount2 * price2;

		System.out.printf("Codigo das pecas: | %d | %d |\n", code1, code2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);

		sc.close();
	}

}