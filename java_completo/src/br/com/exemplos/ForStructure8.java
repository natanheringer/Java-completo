package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ForStructure8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		// ler um numero num e mostrar o numero, o quadrado e o cubo de num

		System.out.print("\nDigite um valor: ");
		int num = sc.nextInt();
		
		for	(int i = 1; i <= num; i++) {
			
			int primeiro = i;
			int quadrado = i * i;
			int cubo = i * i * i;
			
			System.out.printf("%d %d %d%n", primeiro, quadrado, cubo);
			
		}
		

		
		sc.close();

	}

}
