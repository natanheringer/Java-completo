package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		// conversor de Celsius para Fahrenheit


		char resp;
		
		do {
			System.out.print("\nDigite a temperatura em Celsius: ");
			double valorC = sc.nextDouble();
			double F = 9.0 * valorC / 5.0 + 32.0;
			System.out.printf("\nEquivalente em Fahrenheit: %.1f%n", F);
			System.out.print("\nDeseja repetir? (s/n)");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');

		
		sc.close();

	}

}
