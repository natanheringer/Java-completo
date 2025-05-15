package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads the start time and the end time of a game match
		// Calculate the duration of the match
		// the minimum duration being 1 hour and the maximum being 24 hours

		System.out.print("\n========Zezao Lanches========\n");

		System.out.print("\n 1 - Hot-Dog R$ 4.00\n 2 - X-Salada R$ 4.50\n 3 - X-Bacon R$ 5.00\n 4 - Torrada simples R$ 2.00\n 5 - Refrigerante R$ 1.50\n");
		System.out.print("\n=============================\n\n");
		System.out.print("Escolha o codigo do lanche: ");
		int codigo = sc.nextInt();
		System.out.print("\nEscolha a quantidade do lanche escolhido: ");
		int quantidade = sc.nextInt();

		double total;

		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else if (codigo == 5) {
			total = quantidade * 1.5;
		} else {
			System.out.println("Codigo invalido!");
			sc.close();
			return;
		}

		System.out.printf("\n\nTotal a pagar: R$ %.2f", total);

		sc.close();

	}

}