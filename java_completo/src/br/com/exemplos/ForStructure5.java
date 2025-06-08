package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ForStructure5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		// ler um valor inteiro que representa o numero de  casos de teste que vem a seguir 
		// cada caso de teste consiste em 3 valores reais, cada um deles com uma casa decimal 
		// apresente a média ponderada para cada um desses conjuntos de 3 valores,
		// sendo que o primeiro valor tem peso 2, o segunto tem peso 3 e o terceiro peso 5
		
		
		System.out.print("\nDigite o numero de casos: ");
		int caso = sc.nextInt();
		double somaMedia = 0.0;
		for(int i = 0; i < caso; i++) {
			
			System.out.print("\n\nDigite o primeiro numero real: ");
			double c1 = sc.nextDouble();
			System.out.print("\n\nDigite o segundo numero real: ");
			double c2 = sc.nextDouble();
			System.out.print("\n\nDigite o terceiro numero real: ");
			double c3 = sc.nextDouble();
			
			double media = (c1 * 2 + c2 * 3 + c3 * 5) / 10;
			somaMedia = somaMedia + media;
			
			System.out.printf("\nresultado da media ponderada: %.1f%n", media);
			
		}
	
		double mediaFinal = somaMedia / caso;
		System.out.printf("\nsoma final das medias: %.1f%n", mediaFinal);
		
		sc.close();
		
		
		
		
	}
		
}



	


